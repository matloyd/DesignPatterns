package com.matloyd.structurals.adapter;

import com.matloyd.structurals.adapter.hr.adapter.EmployeeDtoAdapter;
import com.matloyd.structurals.adapter.hr.dao.EmployeeDao;
import com.matloyd.structurals.adapter.hr.model.Employee;
import com.matloyd.structurals.adapter.hr.model.EmployeeDto;


public class AdapterDemo {

    public static void main(String[] args) {
    EmployeeDao dao = new EmployeeDao();

    dao.save(new Employee());

//    dao.save(new EmployeeDto()); // Error!
    dao.save(new EmployeeDtoAdapter(new EmployeeDto()));

    }
}
