package org.example;

import java.math.BigDecimal;

public class TicketSeller extends BaseEmployee {

  public TicketSeller(String name, String surname, int hireYear) {
    super(name, surname, hireYear);
  }

  public TicketSeller(String name, String surname, int hireYear, BigDecimal salary) {
    super(name, surname, hireYear, salary);
  }

  @Override
  public BigDecimal calculateMonthlySalary() {
    return this.getSalary();
  }
}
