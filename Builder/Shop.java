/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.BuilderDesignPattern;

/**
 *
 * @author krawler
 */
public class Shop {
    
    public static void main(String[] args){
//        Phone ph = new Phone("Andriod", 8, 5.5, 3100, "QualComm");
        Phone ph = new PhoneBuilder().setOS("Andriod").getPhone();
        
        
        System.out.println(ph);
        
        
    }
}


