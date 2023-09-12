package co.tylermaxwell.savetravels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import co.tylermaxwell.savetravels.models.Expense;
import co.tylermaxwell.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {

    @Autowired ExpenseService expenseService;
    
    @GetMapping("/expenses")
    public String expenses(@ModelAttribute Expense expense,  Model model){
        List<Expense> expenses = expenseService.getAllExpenses();
        System.out.println(expenses);
        model.addAttribute("expenses", expenses);
        return "index.jsp";
    }

    @PostMapping("/expenses")
    public String createExpense(@ModelAttribute Expense expense){
        expenseService.addExpense(expense);
        return "redirect:/expenses";
    }

    @GetMapping("/expenses/{id}")
    public String show(@PathVariable Long id, Model model){
        Expense expense = expenseService.getExpenseById(id);
        System.out.println(expense);
        model.addAttribute("expense", expense);

        return "show.jsp";
    }

    //! UPDATE

    // add the edit.jsp view.

    // route to display the edit form 
    @GetMapping("/expenses/{id}/edit")
    public String edit(@PathVariable Long id, Model model){
        Expense expense = expenseService.getExpenseById(id);
        model.addAttribute("expense", expense);
        return "edit.jsp";
    }

    // route to handle the edit form data
    @PutMapping("/expenses/{id}")
    public String update(@ModelAttribute Expense expense){
        expenseService.editExpense(expense);
        return "redirect:/expenses";
    }

    @DeleteMapping("/expenses/{id}")
    public String destroy(@PathVariable Long id){
        expenseService.deleteExpenseById(id);
        return "redirect:/expenses";
    }

}
