package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    static void main() throws IOException {
        // java에서는 "" 안에 \ 하나만 넣으면 에러
        String[] names = {"RM", "진","슈가","제이홉", "지민","뷔", "정국"};
        String filename = "C:\\Users\\USER\\dev\\gukbi\\01.java\\src\\PrjIO\\src\\ex01\\bts.txt";
        FileWriter fw = new FileWriter(filename);

        for (int i=0; i<names.length; i++) {
            fw.write((i+1)+"."+names[i]+"\n");
        }
        fw.close();
        System.out.println(filename+"이 저장되었습니다.");
    }
}
