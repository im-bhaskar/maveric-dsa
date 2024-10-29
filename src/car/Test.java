package car;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {
  public static void main(String[] args) {
    // Sample list of cars
    List<Car> cars =
        Arrays.asList(
            new Car(1, 15000, "Toyota", "Corolla", 50000, 4.5),
            new Car(2, 20000, "Honda", "Civic", 30000, 4.7),
            new Car(3, 12000, "Ford", "Focus", 40000, 4.0),
            new Car(4, 25000, "Honda", "Accord", 20000, 4.8),
            new Car(5, 10000, "Toyota", "Yaris", 70000, 3.8));

    CarFinder carFinder = new CarFinder();

    // Find best-rated car within budget
    Optional<Car> bestRatedCar = carFinder.findBestRatedCarWithinBudget(cars, 18000);
    bestRatedCar.ifPresent(car -> System.out.println("Best rated car within budget: " + car));

    // Find cars within budget and mileage
    List<Car> budgetMileageCars = carFinder.findCarsWithinBudgetAndMileage(cars, 20000, 50000);
    System.out.println("Cars within budget and mileage:");
    budgetMileageCars.forEach(System.out::println);

    // Find most affordable car by brand
    Optional<Car> affordableToyota = carFinder.findMostAffordableCarByBrand(cars, "Toyota");
    affordableToyota.ifPresent(car -> System.out.println("Most affordable Toyota: " + car));
  }
}
