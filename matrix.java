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
   int num1=sc.nextInt();
   int num[][]=new int[num1][num1]; 
for (int i=0;i<num.length;i++){
    for (int j=0;j<num.length;j++){
        num[i][j]=sc.nextInt();
    }
}
int d1=0;
int d2=0;
for (int k=0;k<num.length;k++){
    for (int j=k;j<k+1;j++){
        d1=d1+num[k][j];
       
    }
}
int dic=2;
for (int l=0;l<num.length;l++){
    for (int j=2;j<num.length;j++){
        d2=d2+num[l][dic];
        dic--;
       
    
}

    
}
System.out.print(Math.abs(d1-d2));
    }
   
}
