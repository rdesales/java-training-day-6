package com.hcl.composite;

import java.time.LocalDate;

public class Mp3 implements File{

    private String name;
    private int size;
    private String date;

    public Mp3(String name, int size) {
        this.name = name;
        this.size = size;
        this.date = String.valueOf(LocalDate.now());
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getCreationDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Mp3{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", date='" + date + '\'' +
                '}';
    }
}
