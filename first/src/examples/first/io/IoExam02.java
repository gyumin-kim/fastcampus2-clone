package examples.first.io;

import java.io.*;

// [] 로 읽어서 [] 쓴다.
public class IoExam02 {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        try {
            File file = new File("/apps/readme.md");
            if(!file.isDirectory() && file.exists()) {
                in = new FileInputStream(file);
                out = new FileOutputStream("/tmp/readme.out");
                byte[] buffer = new byte[1024];
                int readCount = 0;
                // 예를 들어 파일크기가 3000이라면 3번읽어들인다.
                while((readCount = in.read(buffer)) != -1){
                    out.write(buffer,0,readCount);
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            try {
                in.close();
            }catch(IOException ex){}
            try {
                out.close();
            }catch(IOException ex){}
        }
    } // main
}
