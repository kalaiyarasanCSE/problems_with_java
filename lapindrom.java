import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int num = sc.nextInt();
	    sc.nextLine();  
	    
	    String arr[] = new String[num];
	    
	    for(int i = 0; i < num; i++){
	         arr[i] = sc.nextLine();
	    }
	
	    for(int i = 0; i < num; i++){
	        String str = arr[i];
	        
	        str = str.trim();        
	        str = str.toLowerCase(); 
	        
	        int nnum = str.length();
	        String nstr = "";
	        
	        for(int j = nnum - 1; j >= 0; j--){
	            char add = str.charAt(j);
	            nstr = nstr + add;
	        }
	        
	        if(str.equals(nstr)){   
	            System.out.println("YES");
	        }else{
	            System.out.println("NO");
	        }
	    }
	}
}
