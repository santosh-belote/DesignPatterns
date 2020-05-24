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
public class Adapter implements Duck{

    Sparrow sp;
    Adapter(Sparrow sp){
        this.sp = sp;
    }

    @Override
    public void quack() {
       this.sp.makeSound();
    }

  
   
    
}
