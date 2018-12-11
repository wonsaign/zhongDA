package com.zhongda.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zhongda.common.BaseMapper;
import com.zhongda.sys.entity.DirtyWords;	


public interface DirtyWordsMapper extends BaseMapper<DirtyWords> {
    
    @Select(value="select id,dirty_words as dirtyWords,sort_index as sortIndex from dic_dirtywords;")
    List<DirtyWords> findAll();
    
//    int deleteByPrimaryKey(Integer id);
//    
//    int insert(DirtyWords record);
//    
//    int insertSelective(DirtyWords record);
//
//    DirtyWords selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(DirtyWords record);
//
//    int updateByPrimaryKey(DirtyWords record);
}