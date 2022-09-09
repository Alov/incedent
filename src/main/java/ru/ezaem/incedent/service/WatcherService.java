package ru.ezaem.incedent.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.ezaem.incedent.newdomain.Human;
import ru.ezaem.incedent.newdomain.TimeInterval;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class WatcherService {
    private Map<TimeInterval, Human> watcherSchedule = new HashMap<>();


    public Human getCurrentWatcher() {
        LocalDate current = LocalDate.now();
        return watcherSchedule.entrySet().stream()
                .filter(entry -> entry.getKey().isInInterval(current))
                .findFirst()
                .map(Map.Entry::getValue)
                .orElseThrow(() -> new IllegalStateException("Not found Watcher... push Иван Соколовский"));
    }

    public Human getNext() {
        new ArrayList<>().sort();
        return watcherSchedule.entrySet().stream()
                .filter(e -> )
    }
}
