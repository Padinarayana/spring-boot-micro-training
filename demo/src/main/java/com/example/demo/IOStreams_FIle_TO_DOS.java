package com.example.demo;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOStreams_FIle_TO_DOS {
    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis=new DataInputStream(fis);
            long l=dis.readInt();
            System.out.println(l);
            int i=dis.readInt();
            System.out.println(i);

        }
        catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
