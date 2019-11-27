package net.osgg.xmlserving;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class XMLRestController {
  
   @Autowired
   private EmployeeService service;
   

   @GetMapping("/employees")
   public List <Employee> getEmployees(){
     return service.getEmployees();
   }
   
   
}
