package review;

/**
 * 查找字符串出现的次数
 * @author hc
 * @create 2020/10/10 0010 14:52
 */
public class SearchStringCount {

    /**
     * 查找字符串出现的次数，ab 出现 abcbskhabsdldab 次数
     * @param mainStr
     * @param subStr
     * @return
     */
    public int getCount(String mainStr ,String subStr){

        int mainlength = mainStr.length();
        int strlength = subStr.length();
        int count = 0;
//        int index;
        int index = 0;
        if(mainlength > strlength){

            //方式一
//            while ( ( index = mainStr.indexOf(subStr)) != -1 ){
//                count++;
//                mainStr = mainStr.substring(index + strlength);
//            }

            //方式二
            while ( ( index =  mainStr.indexOf(subStr, index)) != -1  ){
                count++;
                index = index + strlength;
            }
            return count;
        }else {
            return 0;
        }

    }

    public static void main(String[] args) {
        SearchStringCount s = new SearchStringCount();
        int count = s.getCount("abcbskhabsdldab", "ab");
        System.out.println(count);
    }

}
