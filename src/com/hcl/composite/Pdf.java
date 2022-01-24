package com.hcl.composite;

import java.time.LocalDate;

public class Pdf implements File{
    private String name;
    private int size;
    private String date;

    public Pdf(String name, int size) {
        this.name = name;
        this.size = size;
        this.date = String.valueOf(LocalDate.now());;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getCreationDate() {
        return date;
    }
}
