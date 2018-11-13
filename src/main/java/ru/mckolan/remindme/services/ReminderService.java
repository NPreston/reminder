package ru.mckolan.remindme.services;

import ru.mckolan.remindme.entities.Remind;

import java.util.List;

public interface ReminderService {
    List<Remind> findAll();

    Remind getById(long id);

    Remind save(Remind remind);

    void removeById(long id);
}
