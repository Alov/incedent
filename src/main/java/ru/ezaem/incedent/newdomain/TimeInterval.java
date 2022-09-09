package ru.ezaem.incedent.newdomain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TimeInterval implements Comparable<TimeInterval> {
    LocalDate from;
    LocalDate to;

    public boolean isInInterval(LocalDate date) {
        return from.isBefore(date) && to.isBefore(date);
    }

    @Override
    public int compareTo(TimeInterval o) {
        return from.compareTo(o.getFrom());
    }
}
