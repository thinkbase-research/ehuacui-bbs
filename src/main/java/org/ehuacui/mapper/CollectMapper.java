package org.ehuacui.mapper;

import org.apache.ibatis.annotations.Param;
import org.ehuacui.model.Collect;

import java.util.List;

public interface CollectMapper {

    int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);

    List<Collect> selectByUid(@Param("uid") Integer uid, @Param("start") Integer start, @Param("limit") Integer limit);

    Collect selectByTidAndUid(@Param("tid") Integer tid, @Param("uid") Integer uid);

    long countByTid(@Param("tid") Integer tid);

    long countByUid(@Param("uid") Integer uid);
}