package test.com.steam.common.util;

import com.steam.common.util.IPUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * StringUtil Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>八月 28, 2017</pre>
 */
public class StringUtilTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: ip2int(String ip)
     */
    @Test
    public void testIp2int() throws Exception {
//TODO: Test goes here...
        String ip = "10.10.1.225";

        Long num = IPUtil.ipToLong(ip);

        System.out.println("111..." + num);
        System.out.println("222..." + IPUtil.longToIP(num));
    }


} 
