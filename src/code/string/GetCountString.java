package code.string;

/**
 * 给定一个字符串str，返回str的统计字符串。例如，"aaabbadddffc"的统计字符串为"a_3_b_2_a_1_d_3_f_2_c_1"。
 * @author hc
 * @create 2020/9/18 0018 0:30
 */
public class GetCountString {

    public String getCountString(String str){
        if(str == null || str.length() == 0){
            return "";
        }
        char[] chars = str.toCharArray();
        String res = String.valueOf(chars[0]);
        int num = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i-1]){
                res = concat(res, String.valueOf(num), String.valueOf(chars[i]));
                num = 1;
            }else {
                num++;
            }
        }
        return concat(res, String.valueOf(num), "");
    }

    public String concat(String s1,String s2,String s3){
        return s1 + "_" + s2 + (s3.equals("") ? s3 : "_" + s3);
    }

    public static void main(String[] args) {
        GetCountString getCountString = new GetCountString();
        System.out.println(getCountString.getCountString("aabbccc"));
    }

}
