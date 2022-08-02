
/* A Program on generating the pattern of series of numbers from 1 to n */

import java.util.Scanner;

public class Pattern_1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of elments in a pattern : ");
        int n = scan.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
