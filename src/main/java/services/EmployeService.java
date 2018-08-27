package services;

import entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeService extends JpaRepository<Employe, Long> {

}
