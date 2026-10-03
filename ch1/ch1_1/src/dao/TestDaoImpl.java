package dao;

public class TestDaoImpl implements TestDao {
    private String msg;

    public void setMsg(String msg){
        this.msg = msg;
    }

    @Override
    public void sayHello1() {
        System.out.println(msg+"Hello Study hard");
    }
    @Override
    public void sayHello2() {
        System.out.println(msg+":Hello world");
    }
}
