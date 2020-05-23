package lv.aleksandra.fileinout;

import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDateTime;

public class TestWrite {
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("file3.txt");
            LocalDateTime today = LocalDateTime.now();

            String inputText = "Text to file     " +  today;
            byte[] bytesArr = inputText.getBytes();
            fileOutputStream.write(bytesArr);
            fileOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }





    }
}
