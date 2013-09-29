import com.home.dao.ConfoDaoImpl;
import com.home.domain.Confo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 29.09.13
 * Time: 1:08
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration(locations = {
        "classpath:spring/out-container.xml",
        "classpath:spring/app-context.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class ConfoDaoIT extends AbstractTransactionalTestNGSpringContextTests {

    private static final Logger LOG = LoggerFactory.getLogger(ConfoDaoIT.class);

    @Resource(name="ConfoDaoImpl")
    private ConfoDaoImpl confoDao;

    @Test
//    @Rollback(false)
    public void loadConfoById() {
        Confo confo1 = confoDao.loadConfoById(3);
        LOG.warn("confo name = {}", confo1.getName());
        confo1 = confoDao.loadConfoById(2);
//        Confo confo = new Confo();
//        confo.setId(2);
//        confo.setName("NAME2");
//        confoDao.save(confo);
        LOG.warn("confo name = {}", confo1.getName());
    }

}
