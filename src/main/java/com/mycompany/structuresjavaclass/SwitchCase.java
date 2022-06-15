/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.structuresjavaclass;
import java.util.Scanner;
/**
 *
 * @author thatguykullie
 */
public class SwitchCase {
    String grade;
    Scanner console = new Scanner(System.in);
    
    public void switchCase()
    {   
        System.out.println("Enter grade:");
        grade = console.nextLine();
        switch (grade)
        {
            case "A":
                System.out.println("Range 70 to 100");
                break;
            case "B":
                System.out.println("Range 59 to 69");
                break;
            case "C":
                System.out.println("Range 40 to 58");
                break;
            case "D":
                System.out.println("Less than 40");
                break;
            default:
                System.out.println("NOT a Grade. Enter A,B,C or D");
                
            
        }
    }
    
}
