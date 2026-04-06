import java.util.Set;
import java.util.LinkedHashSet;


class Main {
    public static void main(String[] args) {
        int[] arr={2,3,1,9,3,1,3,9};

        Set<Integer> s = new LinkedHashSet<>();  
        for (int ele : arr)  s.add(ele);

        for (int x : s)
            System.out.print(x + " ");
    }
}
