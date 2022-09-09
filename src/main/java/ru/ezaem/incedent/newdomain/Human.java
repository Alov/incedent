package ru.ezaem.incedent.newdomain;

import lombok.Data;

import java.util.List;

@Data
public class Human {
    private String firstName;
    private String lastName;
    private List<Contact> contacts;
}
