package com.java.program.number;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Test1 {
    int val = 54;
}
public class Question_23_4 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        try (ObjectOutputStream oos =
  new ObjectOutputStream(new FileOutputStream("d.dat"))) {
            oos.writeObject(t);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

}
