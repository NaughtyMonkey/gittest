package com.feng.springcloud.mapper;

import com.feng.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper
{
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
