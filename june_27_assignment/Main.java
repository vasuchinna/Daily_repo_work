package june_27_assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model A", 1996, 5000));
        cars.add(new Car("Model B", 2012, 7000));
        cars.add(new Car("Model C", 2032, 6000));
        cars.add(new Car("Model D", 2041, 4000));
        cars.add(new Car("Model E", 2012, 6500));

        Collections.sort(cars, new CarComparator());

        
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

