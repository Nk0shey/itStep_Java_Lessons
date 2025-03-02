package Task01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class BoatDockSimulation {
    public static void main(String[] args) {
        // Simulation parameters
        int maxPassengersAtDock = 10;
        int simulationDuration = 100; // Simulated time in minutes
        int passengerArrivalInterval = 3; // Average passenger arrival time in minutes
        int boatArrivalInterval = 10; // Average boat arrival time in minutes
        int maxBoatCapacity = 20;

        Queue<Integer> dockQueue = new LinkedList<>();
        Random random = new Random();

        int currentTime = 0;
        int nextPassengerArrival = passengerArrivalInterval;
        int nextBoatArrival = boatArrivalInterval;

        int totalWaitTime = 0;
        int passengerCount = 0;

        System.out.println("Starting Boat Dock Simulation...");

        while (currentTime <= simulationDuration) {
            // Handle passenger arrivals
            if (currentTime == nextPassengerArrival) {
                dockQueue.add(currentTime);
                nextPassengerArrival += random.nextInt(passengerArrivalInterval) + 1;
            }

            // Handle boat arrivals
            if (currentTime == nextBoatArrival) {
                int boatCapacity = random.nextInt(maxBoatCapacity) + 1; // Random boat capacity
                System.out.println("Boat arrived at time " + currentTime + " with capacity " + boatCapacity);

                while (!dockQueue.isEmpty() && boatCapacity > 0) {
                    int arrivalTime = dockQueue.poll();
                    totalWaitTime += (currentTime - arrivalTime);
                    passengerCount++;
                    boatCapacity--;
                }

                nextBoatArrival += random.nextInt(boatArrivalInterval) + 1;
            }

            // Check dock capacity
            if (dockQueue.size() > maxPassengersAtDock) {
                System.out.println("Dock overcrowded at time " + currentTime);
            }

            currentTime++;
        }

        // Calculate results
        double averageWaitTime = passengerCount == 0 ? 0 : (double) totalWaitTime / passengerCount;

        System.out.println("\nSimulation Ended!");
        System.out.println("Total Passengers Served: " + passengerCount);
        System.out.println("Average Wait Time: " + averageWaitTime + " minutes");
        System.out.println("Passengers Left at Dock: " + dockQueue.size());
    }
}

