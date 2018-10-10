package mapper;

import entities.Administrators;
import entities.AdministratorsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdministratorsMapper {
    long countByExample(AdministratorsExample example);

    int deleteByExample(AdministratorsExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Administrators record);

    int insertSelective(Administrators record);

    List<Administrators> selectByExample(AdministratorsExample example);

    Administrators selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Administrators record, @Param("example") AdministratorsExample example);

    int updateByExample(@Param("record") Administrators record, @Param("example") AdministratorsExample example);

    int updateByPrimaryKeySelective(Administrators record);

    int updateByPrimaryKey(Administrators record);
}