package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> CARS = new ArrayList<>();

    static {
        CARS.add(new Car(111, "LADA", 10));
        CARS.add(new Car(222, "HONDA", 20));
        CARS.add(new Car(333, "TOYOTA", 30));
        CARS.add(new Car(444, "NISSAN", 40));
        CARS.add(new Car(555, "BMW", 50));
    }

    @Override
    public List<Car> getCars(int curent) {
        if (curent == 0) {
            return CARS;
        }
        return CARS.stream().limit(curent).collect(Collectors.toList());
    }
}