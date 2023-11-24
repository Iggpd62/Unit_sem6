import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class NumberListComparatorTest {

    @Test
    public void testCompareLists_bothListsEmpty() {
        NumberListComparator comparator = new NumberListComparator();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        String result = comparator.compareLists(list1, list2);
        assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareLists_firstListEmpty() {
        NumberListComparator comparator = new NumberListComparator();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = Arrays.asList(2, 3, 4);
        String result = comparator.compareLists(list1, list2);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareLists_secondListEmpty() {
        NumberListComparator comparator = new NumberListComparator();
        List<Integer> list1 = Arrays.asList(2, 3, 4);
        List<Integer> list2 = new ArrayList<>();
        String result = comparator.compareLists(list1, list2);
        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareLists_bothListsHaveSingleNumber_sameValue() {
        NumberListComparator comparator = new NumberListComparator();
        List<Integer> list1 = List.of(2);
        List<Integer> list2 = List.of(2);
        String result = comparator.compareLists(list1, list2);
        assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareLists_bothListsHaveSingleNumber_differentValue() {
        NumberListComparator comparator = new NumberListComparator();
        List<Integer> list1 = List.of(2);
        List<Integer> list2 = List.of(3);
        String result = comparator.compareLists(list1, list2);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareLists_bothListsHaveMultipleNumbers() {
        NumberListComparator comparator = new NumberListComparator();
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        String result = comparator.compareLists(list1, list2);
        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareLists_bothListsHaveDifferentSizes() {
        NumberListComparator comparator = new NumberListComparator();
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7);
        try {
            String result = comparator.compareLists(list1, list2);
            assertEquals("Второй список имеет большее среднее значение", result);
        } catch (AssertionError e) {
            assertEquals("Списки имеют разные размеры", e.getMessage());
        }
    }
}