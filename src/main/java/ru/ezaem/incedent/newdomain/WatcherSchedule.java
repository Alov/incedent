package ru.ezaem.incedent.newdomain;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Component
public class WatcherSchedule {
    private Map<LocalDate, Human> schedule = new HashMap<>();
}
