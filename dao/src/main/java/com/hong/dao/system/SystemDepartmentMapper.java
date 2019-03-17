package com.hong.dao.system;

import com.hong.model.system.SystemDepartment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SystemDepartmentMapper {

    List<SystemDepartment> findAll();
}
