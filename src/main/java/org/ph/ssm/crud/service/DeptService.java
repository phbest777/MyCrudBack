package org.ph.ssm.crud.service;

import org.ph.ssm.crud.bean.Department;
import org.ph.ssm.crud.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getAllDept() {
        return departmentMapper.selectAll();
    }
}

