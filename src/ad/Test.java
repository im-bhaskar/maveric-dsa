package ad;

import java.util.Arrays;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    // Sample list of advertisements
    List<Advertisement> ads =
        Arrays.asList(
            new Advertisement("1", 500.0, 300, "Ad Title 1", "Ad Content 1"),
            new Advertisement("2", 700.0, 200, "Ad Title 2", "Ad Content 2"),
            new Advertisement("3", 300.0, 150, "Ad Title 3", "Ad Content 3"),
            new Advertisement("4", 400.0, 250, "Ad Title 4", "Ad Content 4"),
            new Advertisement("5", 600.0, 100, "Ad Title 5", "Ad Content 5"));

    AdvertisementSelector adSelector = new AdvertisementSelector();

    // Maximum height allowed for the advertisements on the front page
    int maxHeight = 500;

    // Select advertisements that maximize profit within height constraints
    List<Advertisement> selectedAds = adSelector.selectMaxProfitAds(ads, maxHeight);

    // Print selected advertisements
    System.out.println("Selected Advertisements:");
    for (Advertisement ad : selectedAds) {
      System.out.println(
          "Title: " + ad.getTitle() + ", Price: " + ad.getPrice() + ", Height: " + ad.getHeight());
    }
  }
}
