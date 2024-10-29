package stock;

/** Represents a Stock with properties that determine its potential profitability. */
public class Stock {
  private String id; // Unique identifier for the stock
  private String name; // Stock name
  private double totalValue; // Total monetary value of all units of this stock
  private long availableUnits; // Number of units available for this stock
  private double
      totalExpectedProfitPerMonth; // Projected total monthly profit for all available units

  public Stock(
      String id,
      String name,
      double totalValue,
      long availableUnits,
      double totalExpectedProfitPerMonth) {
    this.id = id;
    this.name = name;
    this.totalValue = totalValue;
    this.availableUnits = availableUnits;
    this.totalExpectedProfitPerMonth = totalExpectedProfitPerMonth;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(double totalValue) {
    this.totalValue = totalValue;
  }

  public long getAvailableUnits() {
    return availableUnits;
  }

  public void setAvailableUnits(long availableUnits) {
    this.availableUnits = availableUnits;
  }

  public double getTotalExpectedProfitPerMonth() {
    return totalExpectedProfitPerMonth;
  }

  public void setTotalExpectedProfitPerMonth(double totalExpectedProfitPerMonth) {
    this.totalExpectedProfitPerMonth = totalExpectedProfitPerMonth;
  }
}
