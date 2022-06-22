/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.structuresjavaclass;

/**
 *
 * @author thatguykullie
 * 
 * 5 instance variables
 * owner >>> String
 * year of issue
 * system manual or electronic
 * type // food school wedding 
 * manufacturer // company name 
 * 
 * checkCalendar
 * inputNotes
 * readNotes
 * 
 */
public class Diary {
    private String owner;
    private int yearOfIssue;
    private boolean system; // true if manual false if electronic
    private String  type[];
    private String manufacturer;
    
    public Diary(String ownerConstruct,
            int yearOfIssueConstruct,
            boolean systemConstruct,
            String typeConstruct[],
            String manufacturerConstruct)
    {
        ownerConstruct = owner;
        yearOfIssueConstruct = yearOfIssue;
        systemConstruct = system;
        typeConstruct = type;
        manufacturerConstruct = manufacturer;
        
    }
    
    
    
    
   
}
