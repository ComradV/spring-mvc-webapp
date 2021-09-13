package ru.vasiliev.springcourse.models;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Client {
    private int id;
    private String name;
    private String surname;
    private Calendar birthday;

    public Client() {
    }

    public Client(int id, String name, String surname) {
        this(id, name, surname, new GregorianCalendar(1986,Calendar.JANUARY,1));
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Client(int id, String name, String surname, Calendar birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getShortInfo(){
        return name+" "+surname+", "+new SimpleDateFormat("dd.MM.yyyy").format(birthday.getTime());
    }
}
