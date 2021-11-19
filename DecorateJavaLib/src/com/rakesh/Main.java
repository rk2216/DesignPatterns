package com.rakesh;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        int c;
        try{
            // this is used to get where your Java code is running -> System.out.println(System.getProperty("user.dir"));
            InputStream in = new LowerCaseInputStream( new BufferedInputStream( new FileInputStream("./src/test.txt")));
            while((c=in.read()) >=0 ){
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
