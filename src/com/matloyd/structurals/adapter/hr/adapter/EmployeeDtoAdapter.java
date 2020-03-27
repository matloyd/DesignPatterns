package com.matloyd.structurals.adapter.hr.adapter;

import com.matloyd.structurals.adapter.hr.model.Employee;
import com.matloyd.structurals.adapter.hr.model.EmployeeDto;


public class EmployeeDtoAdapter extends Employee {

    private EmployeeDto employeeDto;

    public EmployeeDtoAdapter(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    @Override
    public Long getId() {
        return employeeDto.getId();
    }

    @Override
    public String getCode() {
        return employeeDto.getCode();
    }

    @Override
    public String getFullName() {
        return String.format("%s %s", employeeDto.getFirstName(), employeeDto.getLastName());
    }
}
