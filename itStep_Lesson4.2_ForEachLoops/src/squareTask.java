/*
Користувач вводить з клавіатури довжину та ширину прямокутника.
Виведіть на екран незаповнений прямокутник (відображаються лише межі прямокутника).
Розмір довжини та ширини дорівнює введеним даним.

    #####
    #   #
    #   #
    #   #
    #####

    1.1
    [c]01234[row]
    [0]#####
    [1]#   #
    [2]#   #
    [3]#   #
    [4]#####

    1.2
    if [row == 0] (print #);
    if [column == 0] (print #);
    if [row == 4] (print #);
    if [column == 4] (print #);

    1.3
    if [row == 0] (print #);
    if [column == 0] (print #);
    if [row == rowNumbers - 1] (print #);
    if [column == columnNumbers - 1] (print #);

*/

public class squareTask {
    public static void main(String[] args) {
        int rowNumbers = 5;

        System.out.print("[c]01234");
        System.out.print("[row]");
        System.out.println("");

        for(int row = 0; row < rowNumbers; row++) { // Rows
            System.out.print("[" + row + "]");

            for(int column = 0; column < rowNumbers; column++) {
                if(row == 0 || column == 0 || row == rowNumbers-1 || column == rowNumbers-1){
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}