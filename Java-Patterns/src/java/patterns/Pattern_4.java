
/* Program to print the odd numbers in the given range */

import java.util.Scanner;

public class Pattern_4 {
    
    public static void main(String[] args) {
        
        int n;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the ranging number : ");
        n = scan.nextInt();
        
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}

