package org.acme;

public class Main {
    public static void main(String... args){
        Greeter greeter = new DefaultGreeter();
        System.out.println(greeter.informalGreeting() + " \n");
    }
}
