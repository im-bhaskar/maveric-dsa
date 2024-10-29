package ad;

/** Represents an Advertisement with properties such as price, height, title, and content. */
public class Advertisement {
  private String id; // Unique identifier for the advertisement
  private double price; // Price or profit that can be earned from this advertisement
  private int height; // Height requirement of the advertisement in pixels
  private String title; // Title of the advertisement
  private String content; // Content or description of the advertisement

  public Advertisement(String id, double price, int height, String title, String content) {
    this.id = id;
    this.price = price;
    this.height = height;
    this.title = title;
    this.content = content;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
