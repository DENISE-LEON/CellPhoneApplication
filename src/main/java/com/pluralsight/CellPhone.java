package com.pluralsight;

public class CellPhone {
    private int serialNum;
    private String model;
    private String carrier;
    private String phoneNum;
    private String ownerName;

    public int getSerialNum() {
        return this.serialNum;
    }

    public String getModel() {
        return this.model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    //serial num = 123 model = iphone 17, carrier = verizon, phonenum= 7189837380, owner name = denise
    public CellPhone(int serialNum, String model, String carrier, String phoneNum, String ownerName) {
        this.serialNum = serialNum;
        this.model = model;
        this.carrier = carrier;
        this.phoneNum = phoneNum;
        this.ownerName = ownerName;

    }
}
