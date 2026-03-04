import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        int cou[] = new int[2];
        for(int j = 0; j < 2; j++){
            cou[j] = sc.nextInt();   
        }

        int target = cou[0];
        int k = cou[1];

        int count = 0;

        for(int i = 0; i <= num - k; i++){
            int sum = 0;

            for(int j = i; j < i + k; j++){
                sum += arr[j];
            }

            if(sum == target){
                count++;
            }
        }

        System.out.println(count);
    }
}
