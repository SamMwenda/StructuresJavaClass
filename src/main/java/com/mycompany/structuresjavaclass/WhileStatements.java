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
public class WhileStatements {
    int marks;
    int i = 2;
    
    public void whileStatements() {
        
        while (i != 0){
            // Scanner object to take user input
            Scanner console = new Scanner(System.in);
            //guide user to enter marks
            System.out.println("Enter marks:");
            //marks == input from scanner object
            marks = console.nextInt();
            
            // if greater or equal to 0 and less or equal to 29
            if (marks >= 0 && marks <= 29) {
                System.out.println("Fail");
            } else if (marks >= 30 && marks <= 49) {
                System.out.println("Pass");
            } else if (marks >= 50 && marks <= 69) {
                System.out.println("Good");
            } else if (marks >= 70 && marks <= 100) {
                System.out.println("Excellent");
            }
            // less than 0 or greater than 100
            else {
                System.out.println("Invalid marks");
            }
            // ask user if they wish to keep checking marks if 1 continue if 0 exit program
            System.out.println("To continue press 1 to Exit press 0");
            i = console.nextInt();
        }
    }
}
