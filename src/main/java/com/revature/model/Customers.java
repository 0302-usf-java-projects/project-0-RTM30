package com.revature.model;

import com.revature.service.*;
import com.revature.controller.Menu;

public class Customers {

  
  private String firstName;
  private String lastName;
  private String username;
  private Double balance;
  private String password;
  
  public String getPassword() {
    System.out.println(password);
    return password;
  }

  public void setPassword(String password) {

    this.password = password;
  }



  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getUsername() {
    System.out.println(username);
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Double getBalance() {
    System.out.println(balance);
    return balance;
  }

  public void setBalance(Double balance) {
   this.balance = balance;
  }
  
  

}
