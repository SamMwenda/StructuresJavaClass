/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.structuresjavaclass;

/**
 *
 * @author thatguykullie
 */
public class NestedForLoop {
    
    public void nestedForLoop(){
        for (int i = 1; i <= 40;i++)
        {
            for (int j = 1; j <= i;j++)
            {
                if ( j % 10 == 0)
                {
                    System.out.print(j);
                    
                }
               
            }  
             System.out.println();
        }
        
    }
    
}
