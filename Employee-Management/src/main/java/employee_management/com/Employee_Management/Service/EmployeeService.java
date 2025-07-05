package employee_management.com.Employee_Management.Service;

import employee_management.com.Employee_Management.Entity.Employee;
import employee_management.com.Employee_Management.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

// Service Layer Use Write Business logic 
@Service
public class EmployeeService
{
    @Autowired
   private EmployeeRepository employeeRepository;

    public List<Employee> saveAll(List<Employee> employees)
    {
        return employeeRepository.saveAll(employees);
    }

    public List<Employee> getAll()
    {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getById(Long id)
    {
       return  employeeRepository.findById(id);
    }


    public Employee update (long id , Employee updateEmployee)
    {
       return  employeeRepository.findById(id).map(emp ->
        {
            emp.setName(updateEmployee.getName());
            emp.setLocation(updateEmployee.getLocation());
            emp.setCompany(updateEmployee.getCompany());
            emp.setSalary(updateEmployee.getSalary());
            return employeeRepository.save(emp);
        }).orElse(null);
    }


    public void delete(long id)
    {
        employeeRepository.deleteById(id);
    }

}
