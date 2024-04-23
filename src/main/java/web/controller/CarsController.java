package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

import java.util.Optional;

@Controller
public class CarsController {

    @Autowired
    CarService carService;


    @GetMapping(value = "/cars")
    public String returnCars(@RequestParam(value = "curent", required = false) Optional<Integer> count, Model model) {
        model.addAttribute("cars", carService.getCars(count.orElse(5)));
        return "cars";
    }

}