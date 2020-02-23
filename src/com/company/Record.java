

package com.company;

public class Record {
    private static int count;
    private int id;
    private String name;
    private String surname;
    private String phone;
    private String email;

    public Record() {
        count++;
        id = count;
    }

    public void askInfo() {
        name = Asker.askString("Name");
        surname = Asker.askString("Surname");
        phone = Asker.askString("Phone");
        email = Asker.askString("e-mail");
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

