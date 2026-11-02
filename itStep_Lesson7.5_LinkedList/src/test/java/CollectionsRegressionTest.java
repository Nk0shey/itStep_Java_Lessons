import MyTreeSet.MyTreeSet;
import MyLinkedList.MyLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CollectionsRegressionTest {
 @Test void listRemovalAndBounds() { MyLinkedList<Integer> l=new MyLinkedList<>();l.add(1);l.add(2);l.remove(0);assertEquals(1,l.size());assertEquals(2,l.get(0));assertThrows(IndexOutOfBoundsException.class,()->l.get(1)); }
 @Test void treeNullAndDuplicates() { MyTreeSet<Integer> t=new MyTreeSet<>();assertTrue(t.add(2));assertFalse(t.add(2));assertFalse(t.contains(null));assertFalse(t.remove(null));assertEquals(1,t.size()); }
 @Test void removeRootWithTwoChildren() { MyTreeSet<Integer> t=new MyTreeSet<>();for(int x:new int[]{4,2,6,5,7})t.add(x);assertTrue(t.remove(4));assertFalse(t.contains(4));assertEquals(4,t.size());assertTrue(t.contains(5)); }
}
