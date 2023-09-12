package co.tylermaxwell.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import co.tylermaxwell.savetravels.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
    List<Expense> findAll();
}
