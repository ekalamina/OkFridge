package ru.pps.statistics.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatisticsCrudRepository extends CrudRepository<Prod, Long> {
    @Query("select product, sum(currentvalue) from Prod where owner = ?1 group by owner")
    List<Products> getStatistics(String owner);
    @Query("select product, sum(currentvalue) from Prod where owner = ?1 group by owner")
    List<Products> getStatisticsForDates(String owner, String date1, String date2);
}
