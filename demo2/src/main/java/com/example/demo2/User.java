package com.example.demo2;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private int phone_number;
    private String major;

    public int getPhoneNumber(){
        return phone_number;
    }

    public void setPhoneNumber(int phone_number){
        this.phone_number = phone_number;
    }


    public Integer getId() {
        return id;
      }
    
      public void setId(Integer id) {
        this.id = id;
      }
    
      public String getName() {
        return name;
      }
    
      public void setName(String name) {
        this.name = name;
      }
    
      public String getEmail() {
        return email;
      }
    
      public void setEmail(String email) {
        this.email = email;
      }

      public void setMajor(String major){
        this.major = major;
      }

      public String getMajor(){
        return major;
      }

      


}
