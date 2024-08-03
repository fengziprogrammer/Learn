package com.atguigu.ask;

public class EmployeeService {
    private Employee[] all = new Employee[5];
    private int total;
    public void add(Employee newEmp){//形参是newEmp  newEmp的值是0x1111
        all[total++] = newEmp;//all[0] 里面存储的是0x1111
    }
    public Employee get(int index){
        return all[index];
    }
    //return all[0]里面返回的是0x1111
}
