package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements web.Service.CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int curent) {
        return carDao.getCars(curent);
    }
}