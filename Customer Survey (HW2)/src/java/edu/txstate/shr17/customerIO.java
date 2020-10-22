/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.txstate.shr17;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author spenc
 */
public class customerIO {
    public static void save(customers customer, String filePath){       
        try { 
             File file = new File (filePath);
             PrintWriter out = new PrintWriter(new FileWriter(file, true));
             out.println(customer.getFirstName() + "|"
                    +customer.getLastName() + "|" + customer.getEmail() + "|" 
                    +customer.getHeardAbout() + "|" + customer.getYes()
                    + "|" + customer.getContact());
             out.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }  
    
}
