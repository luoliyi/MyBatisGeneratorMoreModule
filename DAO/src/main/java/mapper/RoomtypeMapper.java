package mapper;

import entities.Roomtype;
import entities.RoomtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomtypeMapper {
    long countByExample(RoomtypeExample example);

    int deleteByExample(RoomtypeExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Roomtype record);

    int insertSelective(Roomtype record);

    List<Roomtype> selectByExample(RoomtypeExample example);

    Roomtype selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Roomtype record, @Param("example") RoomtypeExample example);

    int updateByExample(@Param("record") Roomtype record, @Param("example") RoomtypeExample example);

    int updateByPrimaryKeySelective(Roomtype record);

    int updateByPrimaryKey(Roomtype record);
}