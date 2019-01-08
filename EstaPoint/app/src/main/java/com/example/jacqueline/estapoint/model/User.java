package com.example.jacqueline.estapoint.model;

import java.math.BigInteger;
import java.security.MessageDigest;


public class User {

    private String name;
    private String lastname;
    private String email;
    private String password;


    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setPassword(String password) throws Exception {
        this.password = encodePassword(password);
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setLastname (String lastname){
        this.lastname = lastname;
    }

    private String encodePassword(String password) throws Exception {

        MessageDigest encode = MessageDigest.getInstance("MD5");
        encode.update(password.getBytes(),0,password.length());

        String encodedPassword = new BigInteger(1,encode.digest()).toString(16);

        return  encodedPassword;
    }

}
