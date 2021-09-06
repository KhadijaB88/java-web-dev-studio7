package org.launchcode.studio7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc{

    public CD(String name, int storageCapacity, int remainingStorage, String kindOfDisc){
        super(name, storageCapacity, remainingStorage, kindOfDisc);
    }

    @Override
    public void spinDisc() {
        System.out.println("The disc is spinning");
    }

    @Override
    public void readData() {
        System.out.println("plays music");

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
