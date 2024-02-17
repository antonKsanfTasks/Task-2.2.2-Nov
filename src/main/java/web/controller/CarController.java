package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarServiceImpl carServiceImpl;

    private CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String getCountOfCars(@RequestParam(value = "count", required = false)
                                 Integer count, ModelMap model) {
        if (count == null) {
            model.addAttribute("carList", carServiceImpl.getCars());
        } else {
            model.addAttribute("carList", carServiceImpl.getCars(count));
        }
        return "cars";
    }
}
