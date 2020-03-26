package com.revature.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.revature.model.*;

public class Repository {
  
  public static Map<String, Customers> usernameSet = new HashMap<String, Customers>();
  public static Map<String, String> usernames = new HashMap<String, String>();
  
  // Set the customer object into a list
  public static void addCustomer(Customers n){
    usernameSet.put("1", n);
    //System.out.println(Arrays.asList(usernameSet));
  }
  
  // Set the username into a list
  public static void addUsername(String n){
    usernames.put("1", n);
    System.out.println(usernames.toString());
    //System.out.println(Arrays.asList(usernames));
    System.out.println("Your username is now " + n);
  }

}
