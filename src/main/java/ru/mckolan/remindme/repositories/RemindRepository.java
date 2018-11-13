package ru.mckolan.remindme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mckolan.remindme.entities.Remind;

public interface RemindRepository extends JpaRepository<Remind, Long> {
}
