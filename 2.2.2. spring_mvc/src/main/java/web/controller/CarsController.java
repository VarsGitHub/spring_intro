package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import web.service.CarService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarsController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) String count, Model model) {
        if (count == null || Integer.parseInt(count) >= 5) {
            model.addAttribute("cars", carService.getCarList());
        } else {
            model.addAttribute("cars", carService.getListPart(Integer.parseInt(count)));
        }
        return "cars";
    }
}
