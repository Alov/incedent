package ru.ezaem.incedent.service;

import ru.ezaem.incedent.newdomain.Human;

import java.time.LocalDate;

public interface CalendarWathcer {

    Human getCurrent();

    Human get(LocalDate onDate);

    Human getNext();
}
