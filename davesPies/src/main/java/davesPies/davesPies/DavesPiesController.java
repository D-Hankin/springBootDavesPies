package davesPies.davesPies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 

public class DavesPiesController {

    private static final List<Products> pies = new ArrayList<>();
    private static final List<Employees> employees = new ArrayList<>();

    static {
        pies.add(new Products("Meat", "A fine combination of endangered animals."));
        pies.add(new Products("Veg", "Eugh!"));
        pies.add(new Products("Cheese", "Cheesy goodness"));
        pies.add(new Products("Extra Meat", "Like meat but with extra baby seal."));
        employees.add(new Employees("David","david@david.com"));
        employees.add(new Employees("Kat", "kat@kat.com"));
        
    }

    @GetMapping("/index")
    String getIndex(Model model) {
        System.out.println("Home");
        return "/";
    }

    @GetMapping("/products")
    String getProducts(Model model) {
        model.addAttribute("pies", pies);
        return "/products";
    }

    @GetMapping("/employees")
    String getEmployees(Model model) {
        model.addAttribute("employees", employees);
        return "/employees";
    }
    
}
