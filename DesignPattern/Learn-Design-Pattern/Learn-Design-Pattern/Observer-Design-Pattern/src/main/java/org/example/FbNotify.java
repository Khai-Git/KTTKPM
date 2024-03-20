package org.example;

public class FbNotify implements Observer {

    public FbNotify() {
    }

    @Override
    public void update(String msg) {
        System.out.println("Fb Notify :" + msg);
    }
}
