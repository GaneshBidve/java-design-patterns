package com.gregdferrell.designpatterns.decorator;

/**
 * Created by Greg on 8/2/2017.
 */
public class SimpleSandwich implements Sandwich {

    @Override
    public String make() {
        return "Simple Sandwich";
    }
}
