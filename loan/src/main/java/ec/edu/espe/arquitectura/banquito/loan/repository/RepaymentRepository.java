package ec.edu.espe.arquitectura.banquito.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.espe.arquitectura.banquito.loan.model.Repayment;

@Repository
public interface RepaymentRepository extends JpaRepository<Repayment, Integer> {

}