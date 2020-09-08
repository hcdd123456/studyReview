package test;

/**
 * @author hc
 * @create 2020/9/3 0003 15:12
 */
public class Test {

        public void f() throws Exception{
            String a = "12a5";
            try{
                int value = Integer.parseInt(a);
            }catch(Exception e){
                throw new Exception("数字不合法，抛出异常");
            }
        }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
