package review;

/**
 *
 * @author hc
 * @create 2020/10/5 0005 23:02
 */
public class ReverseString {

    //方案一
    public String resverse(String str ,int startIndex,int endIndex){

        if(str != null && str != ""){
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex;x<y;x++,y--){
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    //方案二
    public String resverse1(String str ,int startIndex,int endIndex){

        if(str != null && str != ""){
            String s = str.substring(0, startIndex);//左闭右开
            for (int i = endIndex; i >= startIndex ; i--) {
                s += str.charAt(i);
            }
            s += str.substring(endIndex+1);
            return s;
        }
        return  null;
    }
    //方案二改进使用SpringBuffer or SpringBuilder
    public StringBuilder resverse2(String str ,int startIndex,int endIndex){
        StringBuilder s = new StringBuilder(str.length());
        if(str != null && str != ""){
            s.append(str.substring(0, startIndex));
            for (int i = endIndex; i >= startIndex; i--) {
                s.append(str.charAt(i));
            }
            s.append(str.substring(endIndex + 1));
            return s;
        }
        return null;
    }

    public static void main(String[] args) {
        ReverseString re = new ReverseString();
        String s = re.resverse("avcdff", 2, 5);
        System.out.println(s);

        ReverseString re1 = new ReverseString();
        String s1 = re1.resverse1("avcdff", 2, 5);
        System.out.println(s1);

        ReverseString re2 = new ReverseString();
        StringBuilder s2 = re2.resverse2("avcdcff", 2, 5);
        System.out.println(s2);
    }

}
