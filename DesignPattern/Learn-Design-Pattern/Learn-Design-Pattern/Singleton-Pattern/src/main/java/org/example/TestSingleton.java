package org.example;

public class TestSingleton {

    private static TestSingleton instance;
    private String msg;

    //modify constructor is Private
    private TestSingleton() {
        this.msg = "manh";
    }


    //use synchronized to prevent creating multiple singleton when multithreading
    public synchronized static TestSingleton getInstance() {
        return instance == null ? new TestSingleton() : instance;
    }

    public void sayHi() {
        System.out.println("Say hi, " + msg);
    }
}
