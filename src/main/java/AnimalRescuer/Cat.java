package org.fasttrackit.animal;

public class Cat extends Animal {

    @Override
    public String name() {
        return "PISICA";
    }

    @Override
    public String walk() {
        return "4 picioare";
    }

    @Override
    public String talk() {
        return "miau-miau";
    }

    @Override
    public String eat() {
        return "soricei";
    }

}