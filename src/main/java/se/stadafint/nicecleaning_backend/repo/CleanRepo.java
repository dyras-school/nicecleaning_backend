package se.stadafint.nicecleaning_backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.stadafint.nicecleaning_backend.model.Clean;

import java.util.Date;

@Repository
public interface CleanRepo extends JpaRepository<Clean, Integer> {

    Clean findCleanByDateAndId(Date date, int id);

}
