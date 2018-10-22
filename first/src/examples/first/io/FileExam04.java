package examples.first.io;

import java.io.File;

public class FileExam04 {
    public static void main(String[] args) {
        File file = new File("/tmp/a/b/c/d/e");
        if(!file.exists()){ // 존재하지않다면
            file.mkdirs(); // 하위에 하위까지 몽땅 디렉토리를 만들다.
        }
    }
}
