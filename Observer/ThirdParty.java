/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.ObserverDesignPattern;

/**
 *
 * @author krawler
 */
public class ThirdParty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Users u1 = new Users("Santosh");
        Users u2 = new Users("Harshad");
        
        InvoiceReport report = new InvoiceReport();
        report.addUser(u1);
        report.addUser(u2);
        
        
        report.addInvoice();
    }
    
}
