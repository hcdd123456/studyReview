package code.string;

/**
 * 如果一个字符串为str，把字符串str前面任意的部分挪到后面形成的字符串叫作str的旋转词。比如str="12345"，str的旋转词有"12345"、"23451"、"34512"、"45123"和"51234"。
 * 给定两个字符串a和b，请判断a和b是否互为旋转词。
 * @author hc
 * @create 2020/9/17 0017 23:47
 */
public class IsRotation {

    public boolean isRotation(String a,String b){
        if(a == null || b ==null || a.length() != b.length()){
            return false;
        }
        String b2 = b + b;
        return b2.indexOf(a) != -1;
    }

    public static void main(String[] args) {
        IsRotation isRotation = new IsRotation();
        System.out.println(isRotation.isRotation("abc", "bca"));
    }

}
