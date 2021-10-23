package com.company;

import ir.huri.jcal.JalaliCalendar;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Vote class to create a specific vote for every person also save date that vote has been taken
 *
 * @author Mohammad Hoseinkhani
 * @version 0.0
 */
public class Vote {
    private Person person;
    private JalaliCalendar date;
    public Vote (Person person, JalaliCalendar date) {
        this.person = person;
        this.date = date;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public JalaliCalendar getDate() {
        return date;
    }
    public void setDate(JalaliCalendar date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return Objects.equals(person, vote.person) && Objects.equals(date, vote.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }
}
