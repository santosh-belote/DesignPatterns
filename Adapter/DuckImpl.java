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
public class DuckImpl implements Duck{
    
    @Override
    public void quack(){
        System.out.println(" Quack Sound. ");
    }
    
}
