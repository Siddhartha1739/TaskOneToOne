package com.example.OneToOne.Service;

import com.example.OneToOne.Entity.EmpProfile;
import com.example.OneToOne.Entity.Address;
import com.example.OneToOne.Entity.Employee;
import com.example.OneToOne.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    public void addEmployee(Employee employee, Address address, EmpProfile empProfile) {
       /* Address address=new Address(1,508224,"Nalgonda");
        employeeRepository.save(new Employee(1,"Rahul","Akunuri","Developer",20000,address,empProfile));*/
        employee.setAddress(address);
        employee.setEmpProfile(empProfile);
        employeeRepository.save(employee);

    }

    public void delEmployee(int empId){
        employeeRepository.deleteById(empId);
    }
    public void updateEmployee(int empId,String firstName,String lastName,String role,int sal,Address address,EmpProfile empProfile){
        Employee employee=employeeRepository.getReferenceById(empId);
        String fName=employee.getFirstName();
        String lName=employee.getLastName();
        String emprole= employee.getRole();
        int salary=employee.getSalary();
        int AddressId=employee.getAddress().getAddressId();
        int PinCode=employee.getAddress().getPinCode();
        String City=employee.getAddress().getCity();
        String Gender=employee.getEmpProfile().getGender();
        long phoneNumber=employee.getEmpProfile().getPhoneNumber();
        fName=firstName;
        lName=lastName;
        emprole=role;
        salary=sal;
        AddressId=address.getAddressId();
        PinCode=address.getPinCode();
        City=address.getCity();
        Gender=empProfile.getGender();
        phoneNumber=empProfile.getPhoneNumber();
        employeeRepository.save(new Employee(empId,fName,lName,emprole,salary,new Address(AddressId,PinCode,City),new EmpProfile(empId,Gender,phoneNumber)));
    }
    public HashMap<Integer, Employee> viewEmployees() {
        HashMap<Integer,Employee> map=new HashMap<>();
        List<Employee> employeeList=employeeRepository.findAll();
        for(Employee emp: employeeList){
            map.put(emp.getEmpId(),emp);
        }
        return map;
    }

    public Employee getEmployeeById(int empId) {
        return employeeRepository.getReferenceById(empId);
    }

    public boolean existEmp(int empId){
        return employeeRepository.existsById(empId);
    }

}
