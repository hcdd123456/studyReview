package code.string;

/**
 * 给定一个字符类型数组chas[]，判断chas中是否所有的字符都只出现过一次，请根据以下不同的两种要求实现两个函数
 * @author hc
 * @create 2020/9/20 0020 14:17
 */
public class IsUniquel {

    public boolean isUnique1(char[] chars){
        if(chars == null){
            return true;
        }
        boolean[] map = new boolean[256];
        for (int i = 0; i < chars.length; i++) {
            if(map[chars[i]]){
                return false;
            }
            map[chars[i]] = true;
        }
        return true;
    }


    public static void main(String[] args) {
        IsUniquel isUniquel = new IsUniquel();
        System.out.println(isUniquel.isUnique1(new char[]{'h', 'e', 'l', 'l', 'o'}));
    }
}
