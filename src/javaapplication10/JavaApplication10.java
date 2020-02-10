/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Hello
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] s = new Student [4];
        Scanner scan = new Scanner(System.in);
        
        
        for (int i = 0;i<s.length;i++){
            s[i] = new Student();
            System.out.println("Enter ID: ");
            s[i].setId(scan.nextInt());
            System.out.println("Enter Name: ");
            s[i].setName(scan.nextLine());
            
        }
        
//        s[0] = "Emesh";
//        s[1] = "Jp";
//        s[2] = "Gene";
//        s[3] = "Hanna";
//        s[4] = "Mamoun";  
//        s[5] = "hello";
//        for (int i = 0; i < s.length; i++){
//            System.out.println(s[i]);
//        }
                
        
        
    }

    
}
