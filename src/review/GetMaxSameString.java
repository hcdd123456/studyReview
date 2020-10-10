package review;

/**
 * @author hc
 * @create 2020/10/10 0010 15:28
 */
public class GetMaxSameString {

    /**
     * 取最大相同子串
     * @param str1
     * @param str2
     * @return
     */
    public String getMaxSameString(String str1,String str2){

        if(str1 != null && str2 != null){
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;

            int length = minStr.length();
            for (int i = 0; i < length; i++) {
                for (int x = 0, y = length - i; y <= length; x++, y++) {//x和y控制滑块前进 每次加一  整个滑块前进一 x每次都是从0开始的
                    String substring = minStr.substring(x, y);
                    if (maxStr.contains(substring)) {
                        return substring;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        GetMaxSameString s = new GetMaxSameString();
        System.out.println(s.getMaxSameString("andkdkdnnd", "sddkdnna"));
    }

}
