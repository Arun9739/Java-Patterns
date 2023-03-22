
/* This program prints * in some increasing fashion 'n' times */

import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter number of rows : ");
        n = scan.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
