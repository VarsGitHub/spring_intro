package web.controller;

import Service.CarService;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) String count, Model model) {
        List<Car> carList = new ArrayList<>();
        CarService carService = new CarService();
        carList.add(new Car("bmw", 300, 925));
        carList.add(new Car("mercedes", 320, 800));
        carList.add(new Car("porsche", 500, 711));
        carList.add(new Car("lada", 90, 1));
        carList.add(new Car("chevrolet", 120, 25));
        if (count == null || Integer.parseInt(count) >= 5) {
            model.addAttribute("cars", carList);
        } else {
            model.addAttribute("cars", carService.getListPart(carList, Integer.parseInt(count)));
        }
        return "cars";
    }
}
