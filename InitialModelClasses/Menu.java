package InitialModelClasses;
import java.util.ArrayList;

/**
 *
 * @author Martinez, Ramos, San Agustin
 */
public class Menu {
  private static ArrayList<Menu> orderList = new ArrayList<>();
  private double totalCost;
  private String smallIcedLatte;
  private double smallIcedLatteCost;
  private String mediumIcedLatte;
  private double mediumIcedLatteCost;
  private String largeIcedLatte;
  private double largeIcedLatteCost;
  private String smallFries;
  private double smallFriesCost;
  private String largeFries;
  private double largeFriesCost;
  private String chocoChipCookies;
  private double chocoChipCookiesCost;

  public Menu(String n, double c) {
    orderList.add(this);
  }

  public double getTotalCost() {
    return totalCost;
  }

  public String getsmallIcedLatte() {
    return smallIcedLatte;
  }

  public double getsmallIcedLatteCost() {
    return smallIcedLatteCost;
  }

  public String getmediumIcedLatte() {
    return mediumIcedLatte;
  }

  public double getmediumIcedLatteCost() {
    return mediumIcedLatteCost;
  }

  public String getlargeIcedLatte() {
    return largeIcedLatte;
  }

  public double getlargeIcedLatteCost() {
    return largeIcedLatteCost;
  }

  public String getsmallFries() {
    return smallFries;
  }

  public double getsmallFriesCost() {
    return smallFriesCost;
  }

  public String getlargeFries() {
    return largeFries;
  }

  public double getlargeFriesCost() {
    return largeFriesCost;
  }

  public String getchocoChipCookies() {
    return chocoChipCookies;
  }

  public double getchocoChipCookiesCost() {
    return chocoChipCookiesCost;
  }
}