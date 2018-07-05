package test;

import com.zy.cmfz.utils.UUIDToString;
import org.junit.Test;

/**
 * @Author:zy
 * @Date: 2018-07-04 22:35
 * @Description:
 */
public class TestUtil {

    @Test
    public void test1(){
        String s = UUIDToString.getUUID();
        System.out.println(s);
    }
}
