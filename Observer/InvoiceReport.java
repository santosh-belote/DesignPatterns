/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.patterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author krawler
 */
public class InvoiceReport implements Subject{
    
    List<Users> userList = new ArrayList<>();
    
    
    @Override
    public void addInvoice(){
        for(Users user: this.userList){
            user.notifySubscribers();
        }
    }

    @Override
    public void addUser(Users user) {
        this.userList.add(user);
    }
    
}
