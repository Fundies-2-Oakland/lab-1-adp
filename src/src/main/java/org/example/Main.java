package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Vector3D vector = new Vector3D(3, -1, 10.2343);
        System.out.println(vector);
        System.out.println(vector.getMagnitude());
        System.out.println(vector.normalize());
    }
}