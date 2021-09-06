package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD cd = new CD("Very Cool", 700, 200,"cd");
        DVD dvd = new DVD("Something", 2700, 400,"dvd");

        cd.readData();
        dvd.readData();

        cd.spinDisc();
        dvd.spinDisc();

        System.out.println(cd.getRemainingStorage());

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
