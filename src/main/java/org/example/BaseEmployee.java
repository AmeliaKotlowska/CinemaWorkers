package org.example;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class BaseEmployee {
  private final static BigDecimal DEFAULT_SALARY = new BigDecimal(3000);
  private final String name;
  private final String surname;
  private final int hireYear;
  private BigDecimal salary;

  public BaseEmployee(String name, String surname, int hireYear, BigDecimal salary) {
    this.name = name;
    this.surname = surname;
    this.hireYear = hireYear;
    this.salary = salary;
  }

  public BaseEmployee(String name, String surname, int hireYear) {
    this.name = name;
    this.surname = surname;
    this.hireYear = hireYear;
    this.salary = DEFAULT_SALARY;
  }

  public int getHireYears() {
    return LocalDate.now().getYear() - this.hireYear;
  }

  public abstract BigDecimal calculateMonthlySalary();

  public BigDecimal getSalary() {
    return salary;
  }
}
