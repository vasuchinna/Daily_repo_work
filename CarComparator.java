package june_27_assignment;

import java.util.Comparator;

class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        if (c1.getYear() != c2.getYear()) {
            return Integer.compare(c1.getYear(), c2.getYear());
        } else {
            return Double.compare(c1.getPrice(), c2.getPrice());
        }
    }
}

