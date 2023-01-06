package com.oop.collections.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook{
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<String, Student>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.getPhone(), p);
    }

    @Override
    public Student searchByName(String name) {
        for(Student i : phoneBook.values()) {
            if(i.getName() == name) {
                return i;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for(Student i : phoneBook.values()) {
            if(i.getLastname() == lastname) {
                return i;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for(Student i : phoneBook.values()) {
            if(i.getPhone() == phone) {
                return i;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for(String i : phoneBook.keySet()) {
            if(i == phone) {
                phoneBook.remove(i);
            }
        }
    }
}
