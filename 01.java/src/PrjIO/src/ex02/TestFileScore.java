package ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.classfile.BufWriter;

public class TestFileScore {
    static void main() throws IOException {
        String path = "C:\\Users\\USER\\dev\\gukbi\\01.java\\src\\PrjIO\\src\\ex02\\";

        // 입력파일
        String infile = "score.txt";
        FileReader fr = new FileReader(path + infile);
        BufferedReader br = new BufferedReader(fr);
        
    }
}
