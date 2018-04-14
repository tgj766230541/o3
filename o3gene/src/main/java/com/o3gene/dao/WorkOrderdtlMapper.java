package com.o3gene.dao;

import com.o3gene.beans.WorkOrderdtl;

public interface WorkOrderdtlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkOrderdtl record);

    int insertSelective(WorkOrderdtl record);

    WorkOrderdtl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkOrderdtl record);

    int updateByPrimaryKey(WorkOrderdtl record);
}