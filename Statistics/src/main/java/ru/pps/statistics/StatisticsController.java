package ru.pps.statistics;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.pps.statistics.dao.Prod;
import ru.pps.statistics.dao.Products;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    private final StatisticsService statisticsService;

    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping(value = "/{owner}/getStatistics",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Products> getStatistics(@PathVariable @Min(0) String owner) {
        return statisticsService.getStatistics(owner);
    }

    @GetMapping(value = "/{owner}/getStatistics/{date1}/{date2}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Products> getStatisticsForDates(@PathVariable @Min(0) String owner, @PathVariable String date1,
                                            @PathVariable String date2) {
        return statisticsService.getStatisticsForDates(owner, date1, date2);
    }

}
