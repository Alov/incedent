package ru.ezaem.incedent.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Incident {

    private String title;
    private Category category;
    private String description;
    private Watcher assigned;
    private LocalDateTime время_создания;
}
