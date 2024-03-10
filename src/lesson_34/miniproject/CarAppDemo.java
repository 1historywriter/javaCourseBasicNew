package lesson_34.miniproject;

import lesson_34.miniproject.object.Car;
import lesson_34.miniproject.service.CarSeller;

public class CarAppDemo {
    public static void main(String[] args) {
        CarSeller carSeller = new CarSeller();
        carSeller.addCar("123", new Car("Mercedes", "E200","2023","60000"));
        carSeller.addCar("456", new Car("Mercedes", "S580", "2024", "120000"));
        carSeller.addCar("789", new Car("BMW", "520", "2021", "63500"));
        carSeller.addCar("369", new Car("Audi", "A6", "2022", "57680"));

        carSeller.removeCar("123");
        carSeller.removeCar("12358");

        carSeller.updateCarPrice("456", "130000");
        carSeller.updateCarRating("456", "5");
        carSeller.updateCarRating("789", "1");
        carSeller.updateCarRating("123", "5");

        carSeller.findCarByBrand("BMW");
        carSeller.findCarByBrand("Audi");
        carSeller.findCarByBrand("Renault");

        carSeller.findCarByModel("A7");
        carSeller.findCarByModel("X8");

        carSeller.findCarByProductionDate("2022");
        carSeller.findCarByProductionDate("2024");

        carSeller.sortByRating();
        carSeller.sortByPrice();
        carSeller.sortByProductionDate();

        carSeller.printAll();
    }
}
