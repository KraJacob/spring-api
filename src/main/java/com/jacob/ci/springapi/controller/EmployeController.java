package com.jacob.ci.springapi.controller;

import com.jacob.ci.springapi.entity.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jacob.ci.springapi.services.EmployeService;

import java.util.List;

@RestController
public class EmployeController {
    @Autowired
    private EmployeService employeService;

    public void setEmployeService(EmployeService employeService) {
        this.employeService = employeService;
    }

    @GetMapping("/api/employes")
    public List<Employe> employeList() {

        return employeService.findAll();
    }

    @GetMapping("/api/employe/{employeId}")
    public Employe getEmploye(@PathVariable(name = "employeId") Long id){

        return employeService.getOne(id);
    }

    @PostMapping("/api/employe")
    public void saveEmploye(Employe employe){

        employeService.save(employe);
    }

    @DeleteMapping("/api/employe/{employeId}")
    public void deleteEmploye(@PathVariable(name = "employeId") Long id){

        employeService.deleteById(id);
    }

    @PutMapping("/api/employe/{employeId}")
    public void updateEmploye(@RequestBody Employe employe,@PathVariable(name = "employeId") Long id){
        Employe employe1 = employeService.getOne(id);
        if (employe1 !=null){
            employeService.save(employe);
        }

    }

}
