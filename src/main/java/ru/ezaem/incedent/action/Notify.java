package ru.ezaem.incedent.action;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.ezaem.incedent.newdomain.Contact;
import ru.ezaem.incedent.newdomain.Human;
import ru.ezaem.incedent.service.SlackService;
import ru.ezaem.incedent.service.WatcherService;

@Component
@RequiredArgsConstructor
public class Notify implements Action {

    private final WatcherService watcherService;
    private final SlackService slackService;

    @Override
    public ActionResult perform() {
        Human watcher = watcherService.getCurrentWatcher();
        Contact contact = watcher.getContacts().get(0);
        slackService.send(contact.);
    }
}
