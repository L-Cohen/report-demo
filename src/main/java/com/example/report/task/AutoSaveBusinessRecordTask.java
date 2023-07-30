package com.example.report.task;

import cn.hutool.log.Log;
import com.example.report.collect.ReportDataCollector;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */
@Component
public class AutoSaveBusinessRecordTask implements Runnable, ApplicationRunner {

    private static final Log log = Log.get();
    @Resource
    private ReportDataCollector reportDataCollector;

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    private static final ScheduledExecutorService THREAD_POOL = Executors.newScheduledThreadPool(1);

    @Override
    public void run(ApplicationArguments args) {
        THREAD_POOL.scheduleWithFixedDelay(this, 0, 5, TimeUnit.SECONDS);
    }

    @Override
    public void run() {
        long timestamp = System.currentTimeMillis();
        String date = SIMPLE_DATE_FORMAT.format(new Date(timestamp));
        log.info("start collect data time: {}", date);
        reportDataCollector.collectReportData(timestamp);
    }

}
