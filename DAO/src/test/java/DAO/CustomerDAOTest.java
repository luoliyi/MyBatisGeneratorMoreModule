package DAO;

import entities.Customer;
import entities.CustomerExample;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CustomerDAOTest {

    CustomerDAO dao=null;
    @Before
    public void  before(){
        dao=new CustomerDAO();
    }

    @Test
    public void selectByExample() {
        List<Customer>customers= dao.selectByExample(new CustomerExample());
        System.out.println(customers);
    }

    @Test
    public void selectByExampleByPage() {
        CustomerExample example=new CustomerExample();
        /*分页*/
        example.setLimit(2); //limit:页数
        example.setOffset(3); //条数
        List<Customer>customers= dao.selectByExample(example);
        System.out.println(customers);
    }

}