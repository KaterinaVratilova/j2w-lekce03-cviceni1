package cz.czechitas.java2webapps.lekce3.entity;

/**
 * Entita obsahující poštovní adresu.
 */
public class Address {
  private String streetAndNumbers;
  private String city;
  private String zipCode;

  public Address() {
  }

  public Address(String streetAndNumbers, String city, String zipCode) {
    this.streetAndNumbers = streetAndNumbers;
    this.city = city;
    this.zipCode = zipCode;
  }

  public String getStreetAndNumbers() {
    return streetAndNumbers;
  }

  public void setStreetAndNumbers(String streetAndNumbers) {
    this.streetAndNumbers = streetAndNumbers;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  @Override
  public String toString() {
    return String.format("%s, %s %s", streetAndNumbers, zipCode, city);
  }
}
