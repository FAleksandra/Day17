package lv.aleksandra.fileinout;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestBuffRead {
    private static Object BufferedReader;

    public static void main(String[] args) {
        BufferedReader BufferedReader = null;
       // String str = "";
       // int var = 0;
       // BufferedReader BufferedReader2 = null;

        try {
            BufferedReader = new  BufferedReader(new FileReader("C:\\Users\\afjodorova26\\IdeaProjects\\Day17\\files\\readfiles.txt"));
       String readlines = BufferedReader.readLine();
       while(readlines !=null){
           System.out.println(readlines);
           readlines = BufferedReader.readLine();
       }
        BufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
