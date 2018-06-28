package com.hua.store.mapper;

import com.hua.store.pojo.ItemParameterItem;
import com.hua.store.pojo.ItemParameterItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemParameterItemMapper {
    long countByExample(ItemParameterItemExample example);

    int deleteByExample(ItemParameterItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemParameterItem record);

    int insertSelective(ItemParameterItem record);

    List<ItemParameterItem> selectByExampleWithBLOBs(ItemParameterItemExample example);

    List<ItemParameterItem> selectByExample(ItemParameterItemExample example);

    ItemParameterItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemParameterItem record, @Param("example") ItemParameterItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ItemParameterItem record, @Param("example") ItemParameterItemExample example);

    int updateByExample(@Param("record") ItemParameterItem record, @Param("example") ItemParameterItemExample example);

    int updateByPrimaryKeySelective(ItemParameterItem record);

    int updateByPrimaryKeyWithBLOBs(ItemParameterItem record);

    int updateByPrimaryKey(ItemParameterItem record);
}