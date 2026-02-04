import java.util.*;

public class SortPeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Integer[] idx = new Integer[names.length];
        for (int i = 0; i < idx.length; i++) idx[i] = i;

        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);

        String[] res = new String[names.length];
        for (int i = 0; i < idx.length; i++)
            res[i] = names[idx[i]];

        return res;
    }

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
}
