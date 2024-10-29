package stock;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {
  public static void main(String[] args) {
    // Sample list of stocks
    List<Stock> stocks =
        Arrays.asList(
            new Stock("1", "Maveric", 100000, 5000, 2000),
            new Stock("2", "Infy", 200000, 3000, 7000),
            new Stock("3", "TechCorp", 150000, 4000, 6000),
            new Stock("4", "SmartInvest", 250000, 2000, 15000),
            new Stock("5", "GrowthStock", 80000, 6000, 5000));

    StockSelector stockSelector = new StockSelector();

    // Find the most profitable stock
    Optional<Stock> mostProfitableStock = stockSelector.findMostProfitableStock(stocks);
    mostProfitableStock.ifPresent(
        stock ->
            System.out.println(
                "Most profitable stock: "
                    + stock.getName()
                    + " with profit: "
                    + stock.getTotalExpectedProfitPerMonth()));

    // Find stocks with a minimum profit of 6000
    List<Stock> profitableStocks = stockSelector.findStocksWithMinProfit(stocks, 6000);
    System.out.println("Stocks with minimum profit of 6000:");
    profitableStocks.forEach(
        stock ->
            System.out.println(stock.getName() + ": " + stock.getTotalExpectedProfitPerMonth()));

    // Find the stock with the highest profit per unit
    Optional<Stock> highestProfitPerUnitStock = stockSelector.findHighestProfitPerUnit(stocks);
    highestProfitPerUnitStock.ifPresent(
        stock -> System.out.println("Stock with highest profit per unit: " + stock.getName()));
  }
}
