package com.mesn1985.jmx;

public interface PersonMBean {

    public void setName(String name);

    public String getName();

    public void setAge(int age);

    public int getAge();

    public String doIncrementAge();

    public String doChangeName(String name);
}
