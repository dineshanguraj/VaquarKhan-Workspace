package school.springdata.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import school.springdata.jpa.data.SchDayPeriod;

@Repository("schDayPeriodRepository")

public interface SchDayPeriodRepository extends CrudRepository<SchDayPeriod,Integer>{

}
