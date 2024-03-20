package org.example;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        SMSNotify smsNotify = new SMSNotify();
        MailNotify mailNotify = new MailNotify();
        FbNotify fbNotify= new FbNotify();

        subject.attach(smsNotify);
        subject.attach(mailNotify);
        subject.notifyChange("manh1");
        System.out.println("=================");
        subject.detach(smsNotify);
        subject.attach(fbNotify);
        subject.notifyChange("manh2");
        System.out.println("=====================================");
        System.out.println(mailNotify.getMsg());
        System.out.println(smsNotify.getMsg());
    }
}