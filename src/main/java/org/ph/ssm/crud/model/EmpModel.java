package org.ph.ssm.crud.model;

import org.ph.ssm.crud.bean.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工返回信息类，用于返回员工信息
 */
public class EmpModel extends BaseModel {
    private List<Employee> employeeList = new ArrayList<Employee>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee emp) {
        this.employeeList.add(emp);
    }
}
