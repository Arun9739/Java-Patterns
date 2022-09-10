
/* This program prints * symbol 'n' times in horizontal line */

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n;
        
        System.out.print("Enter n : ");
        n = scan.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println('*' + " ");
        }
        
        System.out.println();
    }
}
