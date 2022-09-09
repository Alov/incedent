package ru.ezaem.incedent.end;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GraylogWs {

    private final CoreModule core;

    @PostMapping("/ddos")
    public void ping(GraylogAlert alert) {
        core.sendEvent(new GraloglertEvent(alert));
    }
}
