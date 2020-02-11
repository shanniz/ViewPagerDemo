package com.example.shan.viewpagerdemo;

public class Manufacturer {
    private String mId;
    private String mName;
    private String mAddress;

    public Manufacturer(String id, String name, String address) {
        mId = id;
        mName = name;
        mAddress = address;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }
}
