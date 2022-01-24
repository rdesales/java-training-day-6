package com.hcl.composite;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mp3 mp3 = new Mp3("Los exitos del 80", 1500);
        Pdf pdf = new Pdf("Matematicas aplicadas", 1500);

        Directorio directorio = new Directorio("C:\\Users\\jose\\Desktop\\");
        directorio.addFile(mp3);
        directorio.addFile(pdf);

        System.out.println("Tamaño directorio " + directorio.getSize());
    }
}
