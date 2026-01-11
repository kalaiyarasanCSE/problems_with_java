/* Write a function to find whether the given input number is Even.

If the given number is even, the function should return 2.

Else, it should return 1.

The number passed to the function can be negative, positive, or zero.

Zero should be treated as Even.*/ 



public class problem2 {
    public static int isEven(int number) {
        if (number % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }
public static void main(String[] args) {
    System.out.println(isEven(4));  
    System.out.println(isEven(-3)); 
    System.out.println(isEven(0));  
}
    
}

