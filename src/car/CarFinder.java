package car;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * car.CarFinder class contains methods to search for the most suitable car based on customer's
 * preferences. It includes efficient searching methods to meet different customer criteria.
 */
public class CarFinder {

  /**
   * Finds the car with the best rating within the given budget.
   *
   * @param cars List of available cars.
   * @param maxBudget Maximum price the customer is willing to pay.
   * @return Optional<car.Car> The car with the highest rating within budget.
   *     <p>Time Complexity: O(n), where n is the number of cars. Space Complexity: O(1), only
   *     storing a reference to the best car found.
   */
  public Optional<Car> findBestRatedCarWithinBudget(List<Car> cars, double maxBudget) {
    return cars.stream()
        .filter(car -> car.getPrice() <= maxBudget)
        .max(Comparator.comparingDouble(Car::getRating));
  }

  /**
   * Finds all cars within a specified budget and mileage range.
   *
   * @param cars List of available cars.
   * @param maxBudget Maximum price the customer is willing to pay.
   * @param maxMileage Maximum mileage in KM the customer is comfortable with.
   * @return List<car.Car> List of cars that match the budget and mileage criteria.
   *     <p>Time Complexity: O(n), where n is the number of cars. Space Complexity: O(k), where k is
   *     the number of cars meeting the criteria.
   */
  public List<Car> findCarsWithinBudgetAndMileage(
      List<Car> cars, double maxBudget, double maxMileage) {
    return cars.stream()
        .filter(car -> car.getPrice() <= maxBudget && car.getMileageInKM() <= maxMileage)
        .collect(Collectors.toList());
  }

  /**
   * Finds the most affordable car of a specific brand.
   *
   * @param cars List of available cars.
   * @param brand The car brand the customer is interested in.
   * @return Optional<car.Car> The most affordable car of the specified brand.
   *     <p>Time Complexity: O(n), where n is the number of cars. Space Complexity: O(1), as only a
   *     single reference is stored.
   */
  public Optional<Car> findMostAffordableCarByBrand(List<Car> cars, String brand) {
    return cars.stream()
        .filter(car -> car.getBrand().equalsIgnoreCase(brand))
        .min(Comparator.comparingDouble(Car::getPrice));
  }
}
