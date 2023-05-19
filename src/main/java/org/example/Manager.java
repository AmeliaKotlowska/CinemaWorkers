package org.example;

import java.math.BigDecimal;

public class Manager extends BaseEmployee {
  private final static BigDecimal DEFAULT_SALARY = new BigDecimal(5000);
  private final static BigDecimal DEFAULT_BONUS = new BigDecimal(500);
  private BigDecimal bonus;

  public Manager(String name, String surname, int hireYear) {
    super(name, surname, hireYear, DEFAULT_SALARY);
    this.bonus = DEFAULT_BONUS;
  }

  public Manager(String name, String surname, int hireYear, BigDecimal salary) {
    super(name, surname, hireYear, salary);
    this.bonus = DEFAULT_BONUS;
  }

  @Override
  public BigDecimal calculateMonthlySalary() {
    return this.getSalary().add(bonus);
  }

  public void setBonus(BigDecimal bonus) {
    this.bonus = bonus;
  }
}
