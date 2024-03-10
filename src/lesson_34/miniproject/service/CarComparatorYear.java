package lesson_34.miniproject.service;

import lesson_34.miniproject.object.Car;

import java.util.Comparator;

public class CarComparatorYear implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2){
        Integer year1 = (car1 !=null && car1.getProductionDate() !=null) ? car1.getProductionDate() : 0;
        Integer year2 = (car2 !=null && car2.getProductionDate() !=null) ? car2.getProductionDate() : 0;
        return Integer.compare(year1, year2);
    }
    }
