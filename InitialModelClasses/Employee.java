package InitialModelClasses;
/**
 *
 * @author Martinez, Ramos, San Agustin
 */
public class Employee extends Staff {
  private int energyLvl;
  private int maxEnergyLvl;
  private boolean isHired = false;
  private double hiringFee;

  public Employee(String n, int e, int m, boolean i, double h) {
    super(name, salary);
    energyLvl = e;
    maxEnergyLvl = m;
    isHired = i;
    hiringFee = h;
  }

  public void cleanTable(Table t) {
  }

  public void workRegister() {
  }

  public void giveOrder(Customer c) {
  }
}