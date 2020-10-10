package code.date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hc
 * @create 2020/10/10 0010 16:43
 */
public class DateTime {

    public static void main(String[] args) throws ParseException {

        //字符串“”转换为java.sql.Date
        String birth = "2020-09-01";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(birth);
        System.out.println(date);

        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);

    }

    @Test
    public void a(){

    }

}
