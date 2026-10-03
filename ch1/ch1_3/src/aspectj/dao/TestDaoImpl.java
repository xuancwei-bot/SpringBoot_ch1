package aspectj.dao;
import org.springframework.stereotype.Repository;

@Repository("testDao")              //注解数据访问层Bean
public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("save保存");
    }
    @Override
    public void delete() {
        System.out.println("delete修改");
    }
    @Override
    public void modify() {
        System.out.println("modify删除");
    }
}
