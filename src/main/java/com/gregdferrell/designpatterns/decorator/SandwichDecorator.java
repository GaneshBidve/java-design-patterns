package com.gregdferrell.designpatterns.decorator;

/**
 * Created by Greg on 8/2/2017.
 */
public abstract class SandwichDecorator implements Sandwich {
    protected Sandwich customSandwich;

    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }
}
