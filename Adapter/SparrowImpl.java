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
public class SparrowImpl implements Sparrow{

    @Override
    public void makeSound() {
        System.out.println("Chir Chir");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
    
}
