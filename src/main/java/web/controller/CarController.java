package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarServiceImpl;
import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {

    @GetMapping()
    public String printCars(@RequestParam(defaultValue="5") Integer count, ModelMap model) {
        CarServiceImpl carsServiceImpl = new CarServiceImpl();
        List<Car> qtyCars = carsServiceImpl.carList(count);
        model.addAttribute("cars", qtyCars);
        return "cars";
    }
}
