package test;

import java.io.*;

/**
 * @author hc
 * @create 2020/9/24 0024 0:40
 */
public class TestBookSerialization {

    public static void main(String[] args) {
        BookSerialization book = new BookSerialization(101, 10, "数据结构", 25.5);
        System.out.println(book);
        //序列化对象到文件中
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
            oos.writeObject(book);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //反序列化
        File file = new File("data.txt");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            try {
                BookSerialization book1 = (BookSerialization)objectInputStream.readObject();
                System.out.println(book1);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }

}
