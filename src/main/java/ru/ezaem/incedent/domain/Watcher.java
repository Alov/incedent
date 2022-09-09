package ru.ezaem.incedent.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Watcher {

    private String firstName;
    private String lastName;
    private String slackAccount;
    private String phone;
}
