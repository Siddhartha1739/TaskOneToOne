package com.example.OneToOne.Controller;

import com.example.OneToOne.Entity.EmpProfile;
import com.example.OneToOne.Service.EmployeeService;
import com.example.OneToOne.Entity.Address;
import com.example.OneToOne.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/first")
    public String firstpage(){
        System.out.println("THIS IS MY FIRST PAGE");
        return "first";
    }
    @RequestMapping("/addEmp")
    public String  addEmploye(){
        System.out.println("Employee Details:");
        return "addEmp";
    }

    @RequestMapping("/addedEmployee")
    public String addedEmployee(Employee employee, ModelMap map, Address address, EmpProfile empProfile){
        //if( employeeService.viewEmployees().containsKey(empId)){return "DataExist";}
        System.out.println("added Employee");
        employeeService.addEmployee(employee,address,empProfile);
        map.addAttribute("employee",employee);
        map.addAttribute("address",address);
        map.addAttribute("empProfile",empProfile);
        String name=employee.getFirstName()+" "+employee.getLastName();
        map.put("name",name);
        return "emp";
    }

    @RequestMapping("/delete")
    public String  delete(){
        System.out.println("Employee Details deleting:");
        return "delEmp";
    }
    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(int employeeId,ModelMap model){
        Employee employee = employeeService.getEmployeeById(employeeId);
        if(!employeeService.existEmp(employeeId)){ return "DataNotFound";}
        employeeService.delEmployee(employeeId);
        System.out.println("Employee details deleted...");
        Map<Integer, Employee> employeeMap=employeeService.viewEmployees();
        System.out.println("view after delete Employee");
        model.addAttribute("EmployeeMap",employeeMap);

        return "viewEmp";
    }
    @RequestMapping("/update")
    public String  update(){
        System.out.println("Employee Details updating:");
        return "update";
    }
    @RequestMapping("/updateEmployee")
    public String updateEmployee(int employeeId,ModelMap model,Address address,EmpProfile empProfile){
        Employee employee = employeeService.getEmployeeById(employeeId);
        if(!employeeService.existEmp(employeeId)){ return "DataNotFound";}
        System.out.println("Employee Details updated!!!!!"+employeeId);
        String firstName=employee.getFirstName();
        String lastName=employee.getLastName();
        int empId=employee.getEmpId();
        String role=employee.getRole();
        int salary=employee.getSalary();
        int AddressId=employee.getAddress().getAddressId();
        int PinCode=employee.getAddress().getPinCode();
        String City=employee.getAddress().getCity();
        String Gender=employee.getEmpProfile().getGender();
        long PhoneNumber=employee.getEmpProfile().getPhoneNumber();
        model.addAttribute("firstName",firstName);
        model.addAttribute("lastName",lastName);
        model.addAttribute("empId",empId);
        model.addAttribute("role",role);
        model.addAttribute("salary",salary);
        model.addAttribute("AddressId",AddressId);
        model.addAttribute("PinCode",PinCode);
        model.addAttribute("City",City);
        model.addAttribute("Gender",Gender);
        model.addAttribute("PhoneNumber",PhoneNumber);
        return "updating";
    }

    @RequestMapping("/updated")
    public String updated(int empId,String firstName,String lastName,String role,int sal,ModelMap model,Address address,EmpProfile empProfile){
        employeeService.updateEmployee(empId,firstName, lastName, role,sal,address,empProfile);
        Map<Integer, Employee> employeeMap=employeeService.viewEmployees();
        System.out.println("view Employees");
        model.addAttribute("EmployeeMap",employeeMap);
        return "viewEmp";
    }
    @RequestMapping("/viewEmp")
    public String viewEmploys(ModelMap model){
        Map<Integer, Employee> employeeMap=employeeService.viewEmployees();
        System.out.println("view Employees");
        model.addAttribute("EmployeeMap",employeeMap);
        return "viewEmp";
    }

    @RequestMapping("/DataNotFound")
    public String DataNotFound(){
        return "DataNotFound";
    }
}
