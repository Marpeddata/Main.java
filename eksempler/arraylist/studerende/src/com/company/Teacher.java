package com.company;

public class Teacher {
    public String name;
    public int age;
    public boolean isFemale;


    public Teacher(String tmpName, int tmpAge, boolean tmpIsFemale) {

        this.name = tmpName;
        this.age = tmpAge;
        this.isFemale = tmpIsFemale;


    }
    public String getName() {
        return this.name;
    }
}
