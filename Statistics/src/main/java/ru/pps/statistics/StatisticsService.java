package ru.pps.statistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.pps.statistics.dao.Products;
import ru.pps.statistics.dao.StatisticsCrudRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class StatisticsService {

    @Autowired
    private RestTemplate restTemplate;

    private static Logger logger;

    private StatisticsCrudRepository statisticsCrudRepository;

    public List<Products> getStatistics(String owner) {
        return statisticsCrudRepository.getStatistics(owner);
    }

    public List<Products> getStatisticsForDates(String owner, String date1, String date2) {
        return statisticsCrudRepository.getStatisticsForDates(owner,date1,date2);
    }

}
