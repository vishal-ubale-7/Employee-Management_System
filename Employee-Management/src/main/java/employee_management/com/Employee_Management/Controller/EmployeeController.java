package employee_management.com.Employee_Management.Controller;

import employee_management.com.Employee_Management.Entity.Employee;
import employee_management.com.Employee_Management.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController
{

    @Autowired
    private EmployeeService employeeService;

    // insert employees 
    @PostMapping("/post")
    public ResponseEntity <List<Employee>> saveAll(@RequestBody List<Employee> employees)
    {
        return ResponseEntity.ok(employeeService.saveAll(employees));
    }

    // getAll Employees
    @GetMapping
    public ResponseEntity<List<Employee>> getAll()
    {
        return ResponseEntity.ok(employeeService.getAll());
    }

    // get Employee byId
    @GetMapping("/{id}")
    public Optional<Employee> getById(@PathVariable Long id)
    {
        return employeeService.getById(id);
    }
    
    // update employee byId
    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(@PathVariable long id ,@RequestBody Employee employee)

    {
         Employee updated = employeeService.update(id,employee);
         return  updated !=null? ResponseEntity.ok(updated):ResponseEntity.notFound().build();
    }

    // delete Employee byId
    public ResponseEntity<Void> delete(@PathVariable long id)
    {
        employeeService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
