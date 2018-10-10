package DAO;

import MyBatisUtils.MyBatisUtil;
import entities.Administrators;
import entities.Room;
import entities.RoomExample;
import mapper.RoomMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RoomDAO  implements RoomMapper {
    public long countByExample(RoomExample example) {
        return 0;
    }

    public int deleteByExample(RoomExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer rid) {
        return 0;
    }

    public int insert(Room record) {
        return 0;
    }

    public int insertSelective(Room record) {
        return 0;
    }

    public List<Room> selectByExample(RoomExample example) {
        SqlSession session=MyBatisUtil.openSqlSession(true);
        RoomMapper mapper=session.getMapper(RoomMapper.class);
        List<Room> administrators=mapper.selectByExample(example);
        return administrators;
    }

    public Room selectByPrimaryKey(Integer rid) {
        return null;
    }

    public int updateByExampleSelective(Room record, RoomExample example) {
        return 0;
    }

    public int updateByExample(Room record, RoomExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(Room record) {
        return 0;
    }

    public int updateByPrimaryKey(Room record) {
        return 0;
    }
}
