package InitialModelClasses;
/**
 *
 * @author Martinez, Ramos, San Agustin
 */
public class Customer {
  private String name;
  private double money;
  private double happinessLevel;
  private boolean isSeniorCitizen;
  private boolean isStudent;
  private String assignedTable = "none";

  public Customer(String n, double m, double h, boolean c, boolean s, String a) {
    name = n;
    money = m;
    happinessLevel = h;
    isSeniorCitizen = c;
    isStudent = s;
    assignedTable = a;
  }

  public String getName() {
    return name;
  }

  public double getMoney() {
    return money;
  }

  public double getHappinessLevel() {
    return happinessLevel;
  }

  public boolean getIsSeniorCitizen() {
    return isSeniorCitizen;
  }

  public boolean getIsStudent() {
    return isStudent;
  }

  public String getAssignedTable() {
    return assignedTable;
  }

  public void orderFood() {
  }

}