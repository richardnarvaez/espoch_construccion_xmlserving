package net.osgg.xmlserving;

import java.util.List;

import net.osgg.xmlserving.models_sql.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
public class XMLRestController {
  
   @Autowired
   private EmployeeService service;

   @GetMapping("employees")
   public List <Employee> getEmployees(){
     return service.getEmployees();
   }

   @GetMapping("employees/console")
   public String getEmployeesConsole(){
      httprequestXML.get();
      return "correcto";
   }

}
