package InitialModelClasses;
/**
 *
 * @author Martinez, Ramos, San Agustin
 */
public abstract class Staff {
  protected static String name;
  protected static int salary;

  public Staff(String n, int s) {
    this.name = n;
    this.salary = s;
  }

  public String getName() {
    return this.name;
  }

  public int getSalary() {
    return this.salary;
  }

  public void interact(String n) {
  }
}