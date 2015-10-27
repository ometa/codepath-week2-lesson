package org.ometa.actionbardemo.models;

import java.io.Serializable;

/**
 * Created by devin on 10/27/15.
 */
public class User implements Serializable {
    private int age;

    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
