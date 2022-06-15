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
public class IFStatements {
    int marks;
    
    public void ifStatements(){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter marks:");
        marks = console.nextInt();

        if (marks >= 0 && marks <= 29) {
            System.out.println("Fail");
        } else if (marks >= 30 && marks <= 49) {
            System.out.println("Pass");
        } else if (marks >= 50 && marks <= 69) {
            System.out.println("Good");
        } else if (marks >= 70 && marks <= 100) {
            System.out.println("Excellent");
        } else {
            System.out.println("Invalid marks");
        }
    }
    
    
}
