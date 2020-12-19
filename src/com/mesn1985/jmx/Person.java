package com.mesn1985.jmx;

//Notice naming convention
public class Person implements PersonMBean {

    private String name = "Unknown";
    private int age = 0;

    @Override
    public void setName(String name) {
        if(name==null || name.isEmpty())
            throw new IllegalArgumentException("Name must be provided");
        this.name = name;

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        if(age<0)
            throw new IllegalArgumentException("Age must be larger than 0");
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String doIncrementAge() {
        age++;
        return String.format("%s is now %o years old",name,age);
    }

    @Override
    public String doChangeName(String name) {
        setName(name);
        return String.format("new name is %s",this.name);
    }

    @Override
    public String toString() {
        return "SystemConfig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
