package davesPies.davesPies;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 

public class DavesPiesController {

    private static final List<String> pies = new ArrayList<>();
    private static final List<String> employees = new ArrayList<>();

    @GetMapping("/index")
    String getIndex(Model model) {
        System.out.println("Home");
        return "/";
    }

    @GetMapping("/products")
    String getProducts(Model model) {
        System.out.println("products");
        return "/products";
    }

    @GetMapping("/employees")
    String getEmployees(Model model) {
        System.out.println("employees");
        return "/employees";
    }
    
}
