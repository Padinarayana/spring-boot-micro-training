package com.example.demo;

import java.io.*;

public class IOStreams10 {
    public static void main(String[] args)  {
        try {
            FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(200);
            dos.writeLong(100);
            dos.writeByte(1);
        }
        catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
        catch (IOException ie){
            ie.printStackTrace();
        }
    }
}
