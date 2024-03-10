package lesson_34.miniproject.object;

import java.util.Objects;

public class Car {
    private String carBrand;
    private String carModel;
    private Integer productionDate;
    private Double carPrice;
    private Integer carRating;

    public  Car(String carBrand, String carModel, Integer productionDate, Double carPrice) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.productionDate = productionDate;
        this.carPrice = carPrice;
    }
    public  String getCarBrand() {
        return carBrand;
    }
    public  String getCarModel() {
        return  carModel;
    }
    public Integer getProductionDate(){
        return productionDate;
    }
    public Double getCarPrice(){
        return carPrice;
    }
    public Integer getCarRating(){
        return carRating;
    }

    public void setCarRating(Integer carRating) {
        this.carRating = carRating;
    }
    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", productionDate=" + productionDate +
                ", carPrice=" + carPrice +
                ", carRating=" + carRating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carBrand, car.carBrand) && Objects.equals(carModel, car.carModel) && Objects.equals(productionDate, car.productionDate) && Objects.equals(carPrice, car.carPrice) && Objects.equals(carRating, car.carRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, carModel, productionDate, carPrice, carRating);
    }
}
