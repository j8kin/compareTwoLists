import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void compareTwoListsEqualLists1() {
        ArrayList<String> gaugeList = new ArrayList<>();
        gaugeList.add("aaaa");
        gaugeList.add("bbbb");
        gaugeList.add("cccc");

        ArrayList<String> keysDB = new ArrayList<>();
        keysDB.add("aaaa");
        keysDB.add("bbbb");
        keysDB.add("cccc");

        assertTrue(new Solution().compareTwoLists(gaugeList,keysDB).isEmpty());
    }

    @org.junit.Test
    public void compareTwoListsEqualLists2() {
        ArrayList<String> gaugeList = new ArrayList<>();
        gaugeList.add("aaaa");
        gaugeList.add("bbbb");
        gaugeList.add("cccc");

        ArrayList<String> keysDB = new ArrayList<>();
        keysDB.add("aaaa");
        keysDB.add("cccc");
        keysDB.add("bbbb");

        assertTrue(new Solution().compareTwoLists(gaugeList,keysDB).isEmpty());
    }

    @org.junit.Test
    public void compareTwoListsDBMore1() {
        ArrayList<String> gaugeList = new ArrayList<>();
        gaugeList.add("aaaa");
        gaugeList.add("bbbb");
        gaugeList.add("cccc");

        ArrayList<String> keysDB = new ArrayList<>();
        keysDB.add("aaaa");
        keysDB.add("cccc");
        keysDB.add("bbbb");
        keysDB.add("bbbb");

        List<String> resultList = new Solution().compareTwoLists(gaugeList,keysDB);

        assertFalse(resultList.isEmpty());
        assertEquals(1, resultList.size());
        assertEquals("bbbb", resultList.get(0));
    }

    @org.junit.Test
    public void compareTwoListsDBMore2() {
        ArrayList<String> gaugeList = new ArrayList<>();
        gaugeList.add("aaaa");
        gaugeList.add("bbbb");
        gaugeList.add("cccc");

        ArrayList<String> keysDB = new ArrayList<>();
        keysDB.add("aaaa");
        keysDB.add("cccc");
        keysDB.add("bbbb");
        keysDB.add("ffff");
        keysDB.add("ffff");

        List<String> resultList = new Solution().compareTwoLists(gaugeList,keysDB);

        assertFalse(resultList.isEmpty());
        assertEquals(2, resultList.size());
        assertEquals("ffff", resultList.get(0));
        assertEquals("ffff", resultList.get(1));
    }

    @org.junit.Test
    public void compareTwoListsGaugeMore1() {
        ArrayList<String> gaugeList = new ArrayList<>();
        gaugeList.add("aaaa");
        gaugeList.add("bbbb");
        gaugeList.add("cccc");
        gaugeList.add("bbbb");

        ArrayList<String> keysDB = new ArrayList<>();
        keysDB.add("aaaa");
        keysDB.add("cccc");
        keysDB.add("bbbb");

        List<String> resultList = new Solution().compareTwoLists(gaugeList,keysDB);
        assertFalse(resultList.isEmpty());
        assertEquals(1, resultList.size());
        assertEquals("bbbb", resultList.get(0));
    }

    @org.junit.Test
    public void compareTwoListsGaugeMore2() {
        ArrayList<String> gaugeList = new ArrayList<>();
        gaugeList.add("aaaa");
        gaugeList.add("bbbb");
        gaugeList.add("cccc");
        gaugeList.add("bbbb");
        gaugeList.add("ffff");

        ArrayList<String> keysDB = new ArrayList<>();
        keysDB.add("aaaa");
        keysDB.add("cccc");
        keysDB.add("bbbb");

        List<String> resultList = new Solution().compareTwoLists(gaugeList,keysDB);

        assertFalse(resultList.isEmpty());
        assertEquals(2, resultList.size());
        assertEquals("bbbb", resultList.get(0));
        assertEquals("ffff", resultList.get(1));
    }

    @org.junit.Test
    public void compareTwoListsBothHasDiff1() {
        ArrayList<String> gaugeList = new ArrayList<>();
        gaugeList.add("aaaa");
        gaugeList.add("bbbb");
        gaugeList.add("cccc");
        gaugeList.add("bbbb");
        gaugeList.add("ffff");

        ArrayList<String> keysDB = new ArrayList<>();
        keysDB.add("aaaa");
        keysDB.add("cccc");
        keysDB.add("bbbb");
        keysDB.add("aaaa");

        List<String> resultList = new Solution().compareTwoLists(gaugeList,keysDB);

        assertFalse(resultList.isEmpty());
        assertEquals(3, resultList.size());
        assertEquals("aaaa", resultList.get(0));
        assertEquals("bbbb", resultList.get(1));
        assertEquals("ffff", resultList.get(2));
    }
}