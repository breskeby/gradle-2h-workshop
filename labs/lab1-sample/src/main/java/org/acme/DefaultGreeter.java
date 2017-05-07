package org.acme;

public class DefaultGreeter implements Greeter {
    public String formalGreeting(){
        return "Guten Tag";
    }

    public String informalGreeting(){
        return "Hallo";
    }
}
