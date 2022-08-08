package com.example.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOStreamsf11 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("abc");
        int i;
        while( (i=fis.read())!=-1){
            System.out.println((char) i);
        }
    }
}
