package com.o3gene.dao;

import com.o3gene.beans.WorkOrder;

public interface WorkOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkOrder record);

    int insertSelective(WorkOrder record);

    WorkOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkOrder record);

    int updateByPrimaryKey(WorkOrder record);
}