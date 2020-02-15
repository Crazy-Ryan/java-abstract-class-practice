package com;

public abstract class Animal {

    public abstract double getPrice();

    public String getType() {
        return getClass().getSimpleName();
    }

}
