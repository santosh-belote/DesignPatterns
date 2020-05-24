/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.AdapterDesignPattern;

/**
 *
 * @author krawler
 */
public class Main {
    
    public static void main (String[] args){
        
        // By default Duck is making sound as "Quack"
        Duck d = new DuckImpl();
        d.quack();
        
        // When i want my duck to make sound like Sparrow i will use adapter here
        Sparrow b  = new SparrowImpl() ;
        Duck d1 = new Adapter(b);
        d1.quack(); // on call of quack duck starts making sound "Chir Chir."
        
        
    }
}
