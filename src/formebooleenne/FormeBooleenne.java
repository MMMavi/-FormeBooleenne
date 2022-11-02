/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formebooleenne;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FormeBooleenne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter first value");
        int v1 = scan.nextInt();
        System.out.println("enter second value");
        int v2 = scan.nextInt();
        System.out.println("enter third value");
        int v3 = scan.nextInt();

    
        if ((v1 > v2) && (v1 > v3)) 
        {
            System.out.println("le maximum est :" + v1);
        } else 
        {
            System.out.println("v1 n'est pas le maximum");
        }

    }

}
