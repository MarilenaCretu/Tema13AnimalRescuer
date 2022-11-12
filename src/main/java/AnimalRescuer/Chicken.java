package org.fasttrackit.animal;

public class Chicken extends Animal{

    @Override
    public String name() {
        return "PUI";
    }
    @Override
    public String walk() {
        return "2 picioare";
    }

    @Override
    public String talk() {
        return "pui-pui";
    }

    @Override
    public String eat() {
        return "malai";
    }

}
