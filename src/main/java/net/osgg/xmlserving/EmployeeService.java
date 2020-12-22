package net.osgg.xmlserving;

import java.util.List;

import net.osgg.xmlserving.models_sql.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {
	@Autowired
    private EmployeeRepository repo;

   public List<Employee> getEmployees() {
        return repo.findAll();
    }

}
