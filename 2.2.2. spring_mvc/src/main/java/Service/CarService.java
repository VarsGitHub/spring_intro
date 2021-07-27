package Service;

import model.Car;

import java.util.List;

public class CarService {
    public List<Car> getListPart(List<Car> carList, int count) {
        return carList.subList(0, count);
    }
}
