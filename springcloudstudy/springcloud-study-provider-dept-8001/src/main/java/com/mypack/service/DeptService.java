package com.mypack.service;

import com.mypack.entities.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 插入
     * @param deptEntity
     * @return
     */
    boolean addDept(Dept deptEntity);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    Dept findById(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<Dept> findAll();
}
