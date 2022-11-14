
/* This program prints the * in some unique fashion */

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter n : ");
        n = scan.nextInt();
        
        for(int i = 0; i < n/2; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for(int i = n/2; i >= 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
    }
}
