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
public class Phone {
    private String OS;
    private int ram;
    private double screenSize;
    private int battery;
    private String processor;

    public Phone(String OS, int ram, double screenSize, int battery, String processor) {
        this.OS = OS;
        this.ram = ram;
        this.screenSize = screenSize;
        this.battery = battery;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Phone{" + "OS=" + OS + ", ram=" + ram + ", screenSize=" + screenSize + ", battery=" + battery + ", processor=" + processor + '}';
    }
    
}


class PhoneBuilder {
    
    private String OS;
    private int ram;
    private double screenSize;
    private int battery;
    private String processor;

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }
    
    public Phone getPhone(){
        Phone ph = new Phone(OS, ram, screenSize, battery, processor);
        return ph;
    }
    
}