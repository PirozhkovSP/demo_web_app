package com.demo.ats_network.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String Name;
    private String Surname;
    private String Fathersname;
    private Date dateOfBirth;
    private String eMail;

    public User(String name, String surname, String fathersname, Date dateOfBirth, String eMail) {
        this.Name = name;
        this.Surname = surname;
        this.Fathersname = fathersname;
        this.dateOfBirth = dateOfBirth;
        this.eMail = eMail;
    }

    public User() {

    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getFathersname() {
        return Fathersname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String geteMail() {
        return eMail;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setFathersname(String fathersname) {
        Fathersname = fathersname;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
