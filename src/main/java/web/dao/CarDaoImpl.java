package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Chevrolet", 1, "Yellow"));
        cars.add(new Car("Volvo", 2, "White"));
        cars.add(new Car("Honda", 3, "Blue"));
        cars.add(new Car("Mazda", 4, "Black"));
        cars.add(new Car("Bugatti", 5, "Red"));
    }
    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
