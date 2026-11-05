package ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

    // java는 예외처리 필수 - IO, Conversion 할때
    public static void main(String[] args) throws IOException{
        String path = "C:\\Users\\USER\\dev\\gukbi\\01.java\\src\\PrjIO\\src\\ex01\\";
        String filename = "bts.txt";

        FileReader fr = new FileReader(path+filename);
        BufferedReader br = new BufferedReader(fr);

        String line = "";

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        fr.close();

        System.out.println("End.....");
    }
}