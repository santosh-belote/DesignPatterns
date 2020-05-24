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
public class Users implements Observer{

    private String name;
    InvoiceReport report = new InvoiceReport();
    
    Users(String name){
        this.name= name;
    }
    
    @Override
    public void notifySubscribers() {
        System.out.println("Hey " + this.name+" New invoice is added.");
    }
    
}
