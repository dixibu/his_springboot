package com.orange.mapper;

import com.orange.javaBean.MedicalRecord;

public interface MedicalRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MedicalRecord record);

    int insertSelective(MedicalRecord record);

    MedicalRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MedicalRecord record);

    int updateByPrimaryKey(MedicalRecord record);
}