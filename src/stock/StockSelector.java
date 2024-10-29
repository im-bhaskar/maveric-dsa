package stock;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * StockSelector class provides methods to find the most profitable stock options based on expected
 * monthly profit.
 */
public class StockSelector {

  /**
   * Finds the stock with the highest total expected profit per month.
   *
   * @param stocks List of available stocks.
   * @return Optional<Stock> The stock with the highest projected profit per month.
   *     <p>Time Complexity: O(n), where n is the number of stocks. Space Complexity: O(1), only a
   *     reference to the stock with max profit is stored.
   */
  public Optional<Stock> findMostProfitableStock(List<Stock> stocks) {
    return stocks.stream().max(Comparator.comparingDouble(Stock::getTotalExpectedProfitPerMonth));
  }

  /**
   * Finds all stocks that meet or exceed a specified minimum monthly profit threshold.
   *
   * @param stocks List of available stocks.
   * @param minProfit The minimum profit threshold for selection.
   * @return List<Stock> List of stocks with a projected monthly profit meeting or exceeding the
   *     threshold.
   *     <p>Time Complexity: O(n), iterating over all stocks to filter those matching criteria.
   *     Space Complexity: O(k), where k is the number of stocks meeting the criteria.
   */
  public List<Stock> findStocksWithMinProfit(List<Stock> stocks, double minProfit) {
    return stocks.stream()
        .filter(stock -> stock.getTotalExpectedProfitPerMonth() >= minProfit)
        .collect(Collectors.toList());
  }

  /**
   * Finds the stock with the highest profit per unit, calculated by dividing total monthly profit
   * by the number of available units.
   *
   * @param stocks List of available stocks.
   * @return Optional<Stock> The stock with the highest profit per unit.
   *     <p>Time Complexity: O(n), iterates through each stock to calculate per-unit profit. Space
   *     Complexity: O(1), as it only stores a reference to the most profitable stock per unit.
   */
  public Optional<Stock> findHighestProfitPerUnit(List<Stock> stocks) {
    return stocks.stream()
        .max(
            Comparator.comparingDouble(
                stock -> stock.getTotalExpectedProfitPerMonth() / stock.getAvailableUnits()));
  }
}
