import collections.Stack1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class StackRegressionTest {
 @Test void sizeAndMembership() { Stack1<Integer> s=new Stack1<>(2);s.push(1);s.push(2);assertEquals(2,s.size());assertTrue(s.contains(1));assertTrue(s.remove(1));assertFalse(s.contains(1));assertEquals(1,s.size()); }
 @Test void capacityAndLifo() { Stack1<Integer> s=new Stack1<>(1);s.push(1);s.push(2);assertEquals(1,s.size());assertEquals(1,s.pop());assertTrue(s.isEmpty()); }
 @Test void invalidCapacity() { assertThrows(IllegalArgumentException.class,()->new Stack1<>(0)); }
}
