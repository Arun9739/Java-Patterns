
/* This program prints the * in diagonal fashion */ 

import java.util.Scanner;

public class Pattern_8 {
    
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter n : ");
        n = scan.nextInt();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            System.out.println('*');
        }
    }
}
