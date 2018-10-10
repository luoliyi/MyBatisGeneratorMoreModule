package DAO;

import MyBatisUtils.MyBatisUtil;
import entities.Customer;
import entities.CustomerExample;
import mapper.CustomerMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CustomerDAO  implements CustomerMapper {
    public long countByExample(CustomerExample example) {
        return 0;
    }

    public int deleteByExample(CustomerExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Short customerId) {
        return 0;
    }

    public int insert(Customer record) {
        return 0;
    }

    public int insertSelective(Customer record) {
        return 0;
    }

    public List<Customer> selectByExample(CustomerExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        CustomerMapper mapper=session.getMapper(CustomerMapper.class);
        List<Customer> customers=mapper.selectByExample(example);
        return customers;
    }

    public Customer selectByPrimaryKey(Short customerId) {
        return null;
    }

    public int updateByExampleSelective(Customer record, CustomerExample example) {
        return 0;
    }

    public int updateByExample(Customer record, CustomerExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Customer record) {
        return 0;
    }

    public int updateByPrimaryKey(Customer record) {
        return 0;
    }
}
