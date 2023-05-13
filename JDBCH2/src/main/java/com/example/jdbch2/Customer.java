/**
 * @author      : Linus Fernandes (linusfernandes at gmail dot com)
 * @file        : Customer
 * @created     : Saturday May 13, 2023 17:05:32 IST
 */
package com.example.jdbch2;

public class Customer {
  private long id;
  private String firstName, lastName;

  public Customer(long id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%d, firstName='%s', lastName='%s']",
        id, firstName, lastName);
  }

  // getters & setters omitted for brevity
}
