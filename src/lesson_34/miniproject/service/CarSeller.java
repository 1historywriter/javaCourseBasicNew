package lesson_34.miniproject.service;

import lesson_34.miniproject.object.Car;

import java.util.*;

public class CarSeller {
    private final Map<String, Car> cars = new HashMap<>();
    private final Comparator<Car> carComparatorRating = new CarComparatorPrice();
    private final Comparator<Car> carComparatorPrice = new CarComparatorPrice();
    private final Comparator<Car> carComparatorYear = new CarComparatorYear();

    private void addCar(String vinNumber, Car car) {
        cars.put(vinNumber, car);
        System.out.println("Car: " + car + " with VIN nr.:" + vinNumber + " is added");
    }

    public void removeCar(String vinNumber) {
        if (cars.containsKey(vinNumber)) {
            System.out.println("Car:" + cars.remove(vinNumber) + "with VIN number:" + vinNumber + "is removed");
        } else {
            System.out.println("Car with VIN number:" + vinNumber + "does not exist in collection");
        }
    }

    public void updateCarPrice(String vinNumber, Double newPrice) {
        if (cars.containsKey(vinNumber)) {
            System.out.println("Car:" + cars.get(vinNumber).getCarBrand() + " " + cars.get(vinNumber).getCarModel() + "with VIN number: " + vinNumber + "changed price:");
            System.out.println("from:" + cars.get(vinNumber).getCarPrice());
            cars.get(vinNumber).setCarPrice(newPrice);
            System.out.println("to: " + cars.get(vinNumber).getCarPrice());
        } else {
            System.out.println("Car with VIN number:" + vinNumber + " not exist in collection");
        }
    }

    public void updateCarRating(String vinNumber, Integer newRating) {
        if (cars.containsKey(vinNumber)) {
            System.out.println("Car:" + cars.get(vinNumber).getCarBrand() + " " + cars.get(vinNumber).getCarModel() + "with VIN number:" + vinNumber + "update rating:");
            System.out.println("from:" + cars.get(vinNumber).getCarRating());
            cars.get(vinNumber).setCarRating(newRating);
            System.out.println("to:" + cars.get(vinNumber).getCarRating());
        } else {
            System.out.println("Car with VIN number:" + vinNumber + "not exist in collection");
        }
    }

    public void findCarByBrand(String carBrand) {
        System.out.println("List of all cars (brand): " + carBrand);
        boolean existCarBrand = false;
        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            if (entry.getValue().getCarBrand().equals(carBrand)) {
                System.out.println("Car VIN number:" + entry.getKey());
                System.out.println(entry.getValue());
                existCarBrand = true;
            }
        }
        if (!existCarBrand) {
            System.out.println("Car with brand:" + carBrand + "not exist in collection");
        }
    }

    public void findCarByModel(String carModel) {
        System.out.println("List of all cars (model"):"+carModel);
        boolean existCarModel = false;
        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            if (entry.getValue().getCarModel().equals(carModel)) {
                System.out.println("Car VIN number:" + entry.getKey());
                System.out.println(entry.getValue());
                existCarModel = true;
            }
        }
        if (!existCarModel) {
            System.out.println("Car model:" + carModel + "not exist in collection");
        }
    }

    public void findCarByProductionDate(Integer productionDate) {
        System.out.println("List of all cars (production date): " + productionDate);
        boolean existProductionDate = false;
        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            if (entry.getValue().getProductionDate().equals(productionDate)) {
                System.out.println("Car VIN number:" + entry.getKey());
                System.out.println(entry.getValue());
                existProductionDate = true;
            }
        }
        if (!existProductionDate) {
            System.out.println("Car (production date):" + productionDate + "not exist in collection");
        }
    }

    public void sortByRating() {
        List<Car> carList = new ArrayList<>(cars.values());
        carList.sort(carComparatorRating.reversed());
        System.out.println("List of cars sorted by rating (reversed):");
        for (Car car : carList) {
            System.out.println("VIN Number: " + getVinByCar(car));
            System.out.println(car);
        }
    }

    public void sortByPrice() {
        List<Car> carList = new ArrayList<>(cars.values());
        carList.sort(carComparatorPrice.reversed());
        System.out.println("List of cars sorted by price (reserved):");
        for (Car car : carList) {
            System.out.println("VIN Number:" + getVinByCar(car));
            System.out.println(car);
        }
    }

    public void sortByProductionDate() {
        List<Car> carList = new ArrayList<>(cars.values());
        carList.sort(carComparatorYear.reversed());
        System.out.println("List of cars sorted by production date of brand (reserved):");
        for (Car car : carList) {
            System.out.println("VIN Number:" + getVinByCar(car));
            System.out.println(car);
        }
    }

    public void printAll() {
        System.out.println("List of all cars in our shop:");
        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            System.out.println("VIN number:" + entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    private String getVinByCar(Car car) {
        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            System.out.println("VIN number:" + entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    private String getVinByCar(Car car) {
        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            if (entry.getValue().equals(car)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
