package com.gregdferrell.designpatterns.singleton;

/**
 * Created by Greg on 7/9/2017.
 */
public class GSingleton {

    private static GSingleton instance = null;

    private String message = "hello world!";

    private GSingleton() {

    }

    public static GSingleton getInstance() {
        if (instance == null) {
            instance = new GSingleton();
        }

        return instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String args[]) {
        GSingleton referenceToSingleton = GSingleton.getInstance();

        System.out.println("Message: " + referenceToSingleton.getMessage());
    }
}
