package org.launchcode.studio7;

import java.util.ArrayList;


    public class DVD extends BaseDisc implements OpticalDisc{

        public DVD(String name, int storageCapacity, int remainingStorage, String kindOfDisc) {
            super(name, storageCapacity, remainingStorage, kindOfDisc);
        }

        @Override
        public void spinDisc() {
            System.out.println("spins at 1200 -1500 rpm");
        }

        @Override
        public void readData() {
            System.out.println("outputs videos");

        }

        // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
