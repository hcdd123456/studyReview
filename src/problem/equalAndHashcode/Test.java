package problem.equalAndHashcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hc
 * @create 2020/9/21 0021 23:00
 */
public class Test {


    /**
     * 没重写equal hashcode之前 对象不同但是对象所包含的内容相同 hashSet依然插入成功
     * 说明 equal hashcode 比较的是对象  并没有比较对象里面的内容
     * 所以要重写equal hashcode
     * @return
     */
    public String testHashSet(){
        Set<Teacher> teachers = new HashSet<>();
        teachers.add(new Teacher(1,"Jerry","Male",18));
        teachers.add(new Teacher(2,"Jerry","Male",18));
        boolean isSuccess = teachers.add(new Teacher(1,"Jerry","Male",18));
        if (isSuccess){
            return "成功";
        }else {
            return "失败";
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.testHashSet());
    }


}
