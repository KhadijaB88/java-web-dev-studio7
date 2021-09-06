package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingStorage;
    private String kindOfDisc;
    private ArrayList<String> contents;

    public BaseDisc(String name, int storageCapacity, int remainingStorage, String kindOfDisc) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.remainingStorage = remainingStorage;
        this.kindOfDisc = kindOfDisc;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getRemainingStorage() {
        return remainingStorage;
    }

    public void setRemainingStorage(int remainingStorage) {
        this.remainingStorage = remainingStorage;
    }

    public String getKindOfDisc() {
        return kindOfDisc;
    }

    public void setKindOfDisc(String kindOfDisc) {
        this.kindOfDisc = kindOfDisc;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public void putDataOnDisc(int mb, ArrayList<String> contents){
        if(mb < storageCapacity){
            remainingStorage = storageCapacity - mb;

        }
    }

}
