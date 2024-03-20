package org.example;

public class MailNotify implements Observer {
    private String msg;

    public MailNotify() {
    }

    @Override
    public void update(String msg) {
        this.msg = msg;
        System.out.println("Mail msg is : " + msg);
    }

    public String getMsg() {
        return "Mail is :" + msg;
    }
}
