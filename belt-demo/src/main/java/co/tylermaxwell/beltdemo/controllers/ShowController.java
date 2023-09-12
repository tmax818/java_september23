package co.tylermaxwell.beltdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import co.tylermaxwell.beltdemo.models.Show;
import co.tylermaxwell.beltdemo.service.ShowService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;


@Controller
public class ShowController {

    @Autowired ShowService showService;

    //! CREATE

    @GetMapping("/shows/new")
    public String newShow(@ModelAttribute Show show){
        return "shows/new.jsp";
    }
    
    @PostMapping("/shows")
    public String createShow(@Valid @ModelAttribute Show show, BindingResult result){
        if(result.hasErrors()){
            return "shows/new.jsp";
        } else {
            showService.addShow(show);
            return "redirect:/shows";
        }
    }
    
    // READ ALL
    @GetMapping("/shows")
    public String shows(Model model, HttpSession session){
        if(session.getAttribute("userId") == null){
            return "redirect:/logout";
        }
        List<Show> shows = showService.getAllShows();
        model.addAttribute("shows", shows);
        return "shows/index.jsp";
    }

    // READ ONE
    @GetMapping("/shows/{id}")
    public String showShow(@PathVariable Long id, Model model){
        Show show = showService.getOneShowById(id);
        model.addAttribute("show", show);
        System.out.println(show);
        return "shows/show.jsp";
    }
    
    // UPDATE
    
    @GetMapping("/shows/{id}/edit")
    public String getMethodName(@PathVariable Long id, Model model) {
        Show show = showService.getOneShowById(id);
        model.addAttribute("show", show);
        return "shows/edit.jsp";
    }

    @PutMapping("/shows/{id}")
    public String update(@Valid @ModelAttribute Show show, BindingResult result){
        if(result.hasErrors()){
            return "shows/edit.jsp";
        } else {
            showService.updateAShow(show);
            return "redirect:/shows";
        }
    }

    // DELETE
    @DeleteMapping("/shows/{id}")
    public String destroy(@PathVariable Long id){
        showService.deleteShowById(id);
        return "redirect:/shows";
    }
    

}
