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
public class DoWhileStatements {
    //variable declarations
    String grade;
    int i = 1;
    public void doWhileStatements()
    {   
        do{
            //scanner object to take user input
             Scanner console = new Scanner(System.in);
             //guide user to enter grade
             System.out.println("Enter grade:");
             // grade == scanner object  input
             grade = console.nextLine();
             //case should be type of grade
             switch (grade)
                {
                 //case 1 grade == A
                case "A":
                    System.out.println("Range 70 to 100");
                    //break;
                 //case 2 grade == B   
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
             System.out.println("To continue press 1 to Exit press 0");
             i = console.nextInt();
        }while(i != 0);
         
        
    }
}
