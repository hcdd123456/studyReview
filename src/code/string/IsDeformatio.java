package code.string;

/**
 * 给定两个字符串str1和str2，如果str1和str2中出现的字符种类一样且每种字符出现的次数也一样，那么str1与str2互为变形词。请实现函数判断两个字符串是否互为变形词
 * @author hc
 * @create 2020/9/16 0016 20:04
 */
public class IsDeformatio {

    public boolean isDeformatio(String str1,String str2){
        if (str1 == null || str2 == null || str1.length()!=str2.length()){
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        int[] map = new int[256];
        for (int i = 0; i < chars1.length; i++) {
            //进来的任意一个字符都加了1
            map[chars1[i]]++;
        }
        for (int i = 0; i < chars2.length; i++) {
            if (map[chars2[i]] == 0){
                System.out.println(map[chars2[i]]);
                //只要出现0就返还错误
                return false;
            }else {
                map[chars2[i]]--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsDeformatio i = new IsDeformatio();
        System.out.println(i.isDeformatio("abcc", "abab"));

    }

}
