package test;

import java.io.*;

/**
 * @author hc
 * @create 2020/9/24 0024 0:56
 */
public class TestEmploySerialization {

    public static void main(String[] args) {
        EmploySerialization employ = new EmploySerialization(101, "校长", 25);
        System.out.println(employ);
        //序列化对象到文件中
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employ.txt"));
            oos.writeObject(employ);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //反序列化
        File file = new File("employ.txt");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            try {
                EmploySerialization employ1 = (EmploySerialization)objectInputStream.readObject();
                System.out.println(employ1);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
