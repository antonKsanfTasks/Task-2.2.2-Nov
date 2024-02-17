package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDaoImpl carDao;

    private CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }
    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
