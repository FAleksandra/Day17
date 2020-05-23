package lv.aleksandra.fileinout;

import java.io.File;
import java.io.IOException;

public class TestFileInput {
    public static void main(String[] args) {
        File file = new File("java12.txt");
        try {
            //if(file.createNewFile()) {
            if(file.exists()){
                //System.out.println("Jauns fails ir izveidots!");
                System.out.println("Fails jau eksistē!");
            }else{
                //System.out.println("Fails jau eksistē!");
            System.out.println("Jauns fails ir izveidots!");
            }
            file.createNewFile();




        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file);
    }
}
