package org.example;

import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("IBM_Logo.ch8");

            System.out.println("Data in the file: ");

            // Reads the first byte
            int i = input.read();

            while(i != -1) {
                String hexVal = padLeft(Integer.toHexString(i));
                System.out.print(hexVal + " ");

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }

    private static String padLeft(String hex) {
        if (hex.length() == 2) {
            return hex;
        }
        return "0" + hex;
    }
}