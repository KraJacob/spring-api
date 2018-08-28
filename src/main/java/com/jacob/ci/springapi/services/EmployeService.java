package com.jacob.ci.springapi.services;

import com.jacob.ci.springapi.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeService extends JpaRepository<Employe, Long> {

}
