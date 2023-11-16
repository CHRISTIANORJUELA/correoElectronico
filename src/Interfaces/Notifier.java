package Interfaces;

import models.Person;

public interface Notifier {
    void notificate(Person person,Observer nameSender, String message);
}
