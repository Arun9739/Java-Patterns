
/* Program to print the reverse pattern of numbers */

import java.util.Scanner;

public class Pattern_2 {
    
    public static void main(String[] args) {
        
        int n;
        System.out.println("Enter the number of elements : ");
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        
        System.out.println("The pattern is : ");
        
        for(int i = n; i > 0; i--)
            System.out.print(i + " ");
        
        System.out.println();
    }
}
