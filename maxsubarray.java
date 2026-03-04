import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


import java.util.*;

public class Solution {

    public void value(Scanner scc){
     

        int num = scc.nextInt();
        int arr[] = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = scc.nextInt();
        }

        int max = arr[0];
        int sum = arr[0];

        for(int i = 1; i < num; i++){
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }

        int maxSeq = 0;
        int maxElement = arr[0];

        for(int j = 0; j < num; j++){
            if(arr[j] > 0){
                maxSeq = maxSeq + arr[j];
            }
            if(arr[j] > maxElement){
                maxElement = arr[j];
            }
        }

        if(maxSeq == 0){
            maxSeq = maxElement;
        }

        System.out.println(max + " " + maxSeq);
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();

        Solution kalai = new Solution();

        while(times > 0){
            kalai.value(sc);
            times--;
        }
    }
}
