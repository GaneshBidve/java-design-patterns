package com.gregdferrell.designpatterns.decorator;

/**
 * Created by Greg on 8/2/2017.
 */
public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
