package annotation.dao;
import org.springframework.stereotype.Repository;

@Repository("testDaoImpl")
public class TestDapImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("testDao save");
    }
}
