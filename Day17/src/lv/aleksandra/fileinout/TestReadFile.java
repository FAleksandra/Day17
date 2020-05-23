package lv.aleksandra.fileinout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("files\\readfiles.txt");
        int i = 0;
                while((i = fileInputStream.read()) != -1) {
            System.out.print((char)i);
        }
        fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
