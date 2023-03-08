package org.ph.ssm.crud.model;
import org.ph.ssm.crud.bean.Department;
import  org.ph.ssm.crud.bean.Employee;
import java.util.List;

public class EmpVabModel extends BaseModel{
    private List<Employee> EmpList;
    public void setList(List<Employee> empList) {
        this.EmpList = empList;
    }
    public List<Employee> getEmpList(){return EmpList;}
}
