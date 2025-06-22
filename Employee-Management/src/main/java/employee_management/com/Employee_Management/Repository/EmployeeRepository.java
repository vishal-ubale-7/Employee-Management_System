package employee_management.com.Employee_Management.Repository;

import employee_management.com.Employee_Management.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}
