package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("bmw", 300, 925));
        carList.add(new Car("mercedes", 320, 800));
        carList.add(new Car("porsche", 500, 711));
        carList.add(new Car("lada", 90, 1));
        carList.add(new Car("chevrolet", 120, 25));
    }

    public List<Car> showList(String count) {
        if (count == null || Integer.parseInt(count) >= 5) {
            return carList;
        } else {
            return carList.subList(0, Integer.parseInt(count));
        }
    }
}
