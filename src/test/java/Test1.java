import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 29.09.13
 * Time: 0:51
 * To change this template use File | Settings | File Templates.
 */
public class Test1 {

    private static final Logger LOG = LoggerFactory.getLogger(Test1.class);

    @Test
    public void test1() {
        LOG.warn("STARTED");
    }
}
