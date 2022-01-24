package com.hcl.composite;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio implements File{
    private String name;
    private int size;
    private String date;
    private ArrayList<File> files = new ArrayList<>();



    public Directorio(String name) {
        this.name = name;
        this.date = String.valueOf(LocalDate.now());
    }

    @Override
    public int getSize() {
        for (File file : files) {
            size += file.getSize();
        }
        return size;
    }

    @Override
    public String getCreationDate() {
        return date;
    }

    public void addFile(File file){
        files.add(file);
    }

    @Override
    public String toString() {

        String directory = "";
        for (File file : files) {
            directory += file.toString() + "\n";
        }

        return "Directorio{" +
                "\nname='" + name + '\'' +
                "\nsize=" + getSize() +
                "\ndate='" + date + '\'' +
                "\nfiles= " + directory +
                "}";
    }
}
