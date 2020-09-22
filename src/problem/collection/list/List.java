package problem.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author hc
 * @create 2020/9/22 0022 16:26
 */
public class List {


    public void testArraryList(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(12,15,36,45,8,9));
        arrayList.forEach(System.out :: println);
    }


    public static void main(String[] args) {
        List list = new List();
        list.testArraryList();
    }

}
