package ad;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * AdvertisementSelector class provides methods to find the set of advertisements that maximizes the
 * profit while staying within the allowed height limit on the front page.
 */
public class AdvertisementSelector {

  /**
   * Finds the most profitable selection of advertisements that fits within a given height limit.
   *
   * @param ads List of available advertisements.
   * @param maxHeight The maximum allowable height for advertisements on the front page.
   * @return List<Advertisement> The subset of advertisements that maximizes profit within height
   *     constraints.
   *     <p>Time Complexity: O(n log n) for sorting, followed by O(n) selection, where n is the
   *     number of ads. Space Complexity: O(k), where k is the number of ads selected.
   */
  public List<Advertisement> selectMaxProfitAds(List<Advertisement> ads, int maxHeight) {
    // Sort advertisements by price-to-height ratio in descending order
    ads.sort(Comparator.comparingDouble(ad -> -ad.getPrice() / ad.getHeight()));

    List<Advertisement> selectedAds = new ArrayList<>();
    int currentHeight = 0;

    // Select ads based on sorted list, ensuring total height doesn't exceed maxHeight
    for (Advertisement ad : ads) {
      if (currentHeight + ad.getHeight() <= maxHeight) {
        selectedAds.add(ad);
        currentHeight += ad.getHeight();
      }
    }

    return selectedAds;
  }
}
