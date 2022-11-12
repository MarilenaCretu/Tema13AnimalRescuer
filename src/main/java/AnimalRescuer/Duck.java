package org.fasttrackit.animal;

public class Duck extends Animal{

    @Override
    public String name() {
        return "RATA";
    }
    @Override
    public String walk() {
        return "2 picioare";
    }

    @Override
    public String talk() {
        return "mac-mac";
    }

    @Override
    public String eat() {
        return "iarba";
    }

}