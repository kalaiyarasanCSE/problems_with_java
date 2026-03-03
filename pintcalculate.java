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

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        int na=0;
        int nb=0;
        
  for(int i = 0; i < a.length; i++){
             a[i] = sc.nextInt();
        }
        for(int i = 0; i < b.length; i++){
             b[i] = sc.nextInt();
        }
for(int j=0;j<a.length;j++){
    if(a[j]!=b[j])
    {
    if(a[j]>b[j]){
        na++;
        
    }else{
        nb++;
    }
    }
}
System.out.print(na+" "+nb);
    

}
}
