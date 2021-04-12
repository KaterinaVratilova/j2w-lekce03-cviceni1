package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * Entita obsahující osobní údaje.
 */
public class Person {
  private String givenName;
  private String surname;
  private LocalDate birthDate;

  public Person() {
  }

  public Person(String givenName, String surname, LocalDate birthDate) {
    this.givenName = givenName;
    this.surname = surname;
    this.birthDate = birthDate;
  }

  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public int getAge() {
    Objects.requireNonNull(birthDate);

    Period period = birthDate.until(LocalDate.now());
    return period.getYears();
  }

  @Override
  public String toString() {
    return String.format("%1$s %2$s (nar. %3$te. %3$tm. %3$tY)", givenName, surname, birthDate);
  }

}
