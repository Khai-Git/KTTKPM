package org.example;

public class SMSNotify implements Observer {
    private String msg;

    public SMSNotify() {
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        System.out.println("SMS msg is : " + msg);
    }

    public String getMsg() {
        return "SMS s : " + msg;
    }
}
