package com.company;

public class GetId extends Thread {
    public void run(){
        System.out.println("run");
    }

    public static void main(String[] args) {
        GetId p1=new GetId();
        System.out.println("name of p1 is "+p1.getName());
        System.out.println("id of p2 is "+p1.getId());
        p1.start();
    }
}
