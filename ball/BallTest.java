package com.ball;

public class BallTest extends Ball {

    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball("big");
        Ball b3 = new Ball("normal", "volleyball");
        Ball b4 = new Ball("normal", "football", "black'n'white");

        b1.setSize("mini");
        b1.setType("mini-football");
        b1.setColor("black'n'yellow");
        b2.setType("basketball");
        b2.setColor("orange");
        b3.setColor("white'n'blue");

        System.out.println(b1);
        b1.choice();
        System.out.println(b2);
        b2.choice();
        System.out.println(b3);
        b3.choice();
        System.out.println(b4);
        b4.choice();
    }
}