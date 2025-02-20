package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    private final CarServiceImpl carServiceImpl;

    @Autowired
    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping()
    public String printCars(@RequestParam(defaultValue="5") Integer count, ModelMap model) {
        List<Car> qtyCars = carServiceImpl.carList(count);
        model.addAttribute("cars", qtyCars);
        return "cars";
    }
}
