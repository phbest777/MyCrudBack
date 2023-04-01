package org.ph.ssm.crud.model;
import org.ph.ssm.crud.bean.Department;
import  org.ph.ssm.crud.bean.Employee;
import java.util.List;

public class EmpVabModel extends VabBaseModel{
    private List<Employee> data;
    public List<Employee> getData()
    {
        return data;
    }
    public void setData(List<Employee> data) {
        this.data = data;
    }

}
