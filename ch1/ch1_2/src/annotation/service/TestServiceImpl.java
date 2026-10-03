package annotation.service;
import annotation.dao.TestDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("testServiceImpl")
public class TestServiceImpl implements TestService {
    @Resource(name="testDaoImpl")
    private TestDao testDao;
    @Override
    public void save() {
        testDao.save();
        System.out.println("testService save");
    }
}
