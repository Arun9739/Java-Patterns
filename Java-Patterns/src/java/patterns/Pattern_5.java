
/* This program prints all prime numbers till given number */

import java.util.Scanner;

public class Pattern_5 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a = 2;
        
        System.out.println("Enter the number : ");
        int n = scan.nextInt();
        
        if (n >= 2)
            System.out.print(2 + " ");
        
        for(int i = 2; i <= n; i++){
            if(Math.pow(a, i-1) % i == 1)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
