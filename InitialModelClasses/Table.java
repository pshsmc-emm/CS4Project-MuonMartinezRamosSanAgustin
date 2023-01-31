package InitialModelClasses;

/**
 *
 * @author Martinez, Ramos, San Agustin
 */
public class Table {
  private String tableNum;
  private double capacity;
  private String cleanliness;

  public Table(String t, double c, String b) {
    tableNum = t;
    capacity = c;
    cleanliness = b;
  }

  public String getTableNum() {
    return tableNum;
  }

  public double getCapacity() {
    return capacity;
  }

  public String getCleanliness() {
    return cleanliness;
  }

  public void occupy(Table t) {
  }
}