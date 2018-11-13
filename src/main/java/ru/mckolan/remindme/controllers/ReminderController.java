package ru.mckolan.remindme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.mckolan.remindme.entities.Remind;
import ru.mckolan.remindme.services.ReminderService;

import java.util.List;

@RestController
@RequestMapping(value = "/reminders", produces = MediaType.APPLICATION_JSON_VALUE)
public class ReminderController {

    @Autowired
    private ReminderService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable long id) {
        return service.getById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind) {
        return service.save(remind);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteReminder(@PathVariable long id) {
        service.removeById(id);
    }
}
