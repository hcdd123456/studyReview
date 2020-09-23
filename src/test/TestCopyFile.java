package test;

import java.io.*;

/**
 * @author hc
 * @create 2020/9/24 0024 0:27
 */
public class TestCopyFile {

    public static void main(String[] args) {
        copyFile();
    }

    public static void copyFile(){
        File src = new File("d:\\io\\src.txt");
        File des = new File("d:\\io\\des.txt");

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(des);
            byte[] bytes = new byte[1024];
            while (true){
                try {
                    int len = fis.read(bytes,0,bytes.length);
                    if(len == -1){
                        break;
                    }else {
                        fos.write(bytes,0,len);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("文件复制成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
