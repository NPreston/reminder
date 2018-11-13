package ru.mckolan.remindme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mckolan.remindme.entities.Remind;
import ru.mckolan.remindme.repositories.RemindRepository;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService{

    @Autowired
    private RemindRepository remindRepository;

    @Override
    public List<Remind> findAll() {
        return remindRepository.findAll();
    }

    @Override
    public Remind getById(long id) {
        return remindRepository.getOne(id);
    }

    @Override
    public Remind save(Remind remind) {
        return remindRepository.saveAndFlush(remind);
    }

    @Override
    public void removeById(long id) {
        remindRepository.deleteById(id);
    }
}
