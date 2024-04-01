package EmployeeServies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.Entiy.Employee;

import EmployeeRepo.EmployeeRepo;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public abstract class EmployeeserviesImpl implements EmployeesServies {
   @Autowired
    private static EmployeeRepo  employeerepo;

    @Override
    public Employee createEmployee(Employee employee) {
        return (Employee) employeerepo.save(employee);
    }

    
	public static Employee getEmployeeById(Integer employeeId) {
        Optional<Employee> optionalUser = employeerepo.findById(employeeId);
        return optionalUser.get();
    }

  
	@Override
    public List<Employee> getAllEmployee() {
        return employeerepo.findAll();
    }

    @Override
    public Employee updateEmployee(Employee Employee) {
        Employee existingEmployee = EmployeeRepo.findById(Employee.getId()).get();
        existingEmployee.setPhoneNumber(Employee.getPhoneNumber());
        existingEmployee.setemail(Employee.getemail());
        existingEmployee.setcreatedAt(Employee.getcreatedAt());
        existingEmployee.setupdatedAt(Employee.getupdatedAt());
        existingEmployee.setdeletedAt(Employee.getdeletedAt());
        existingEmployee.setlinkedId(Employee.linkedId());
        existingEmployee.setlinkPrecedence(Employee.linkPrecedence());
        Employee updatedEmployee = employeerepo.save(existingEmployee);
        return updatedEmployee;
    }

    @Override
    public void deleteEmployee(Integer EmployeeId) {
        employeerepo.deleteById(EmployeeId);
    }

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(Employee Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Integer EmployeeId) {
		// TODO Auto-generated method stub
		
	}
}