package examples.first.io;

import java.io.*;

// 1 바이트씩 읽어서 1바이트씩 쓴다.
public class IoExam01 {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        try {
            File file = new File("/apps/readme.md");
            if(!file.isDirectory() && file.exists()) {
                in = new FileInputStream(file);
                out = new FileOutputStream("/tmp/readme.out");
                int readData = 0;
                while((readData = in.read()) != -1){
                    out.write(readData);
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
