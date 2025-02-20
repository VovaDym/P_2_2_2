package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Honda", "CRV", 2018));
            carList.add(new Car("Kia", "K5", 2022));
            carList.add(new Car("Lada", "Vesta", 2019));
            carList.add(new Car("Honda", "Civic", 2012));
            carList.add(new Car("Mercedes-Benz", "C-Class 180", 2020));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}