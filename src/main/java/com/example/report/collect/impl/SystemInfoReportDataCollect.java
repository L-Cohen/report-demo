package com.example.report.collect.impl;

import com.example.report.collect.ReportDataCollect;
import com.example.report.to.SystemInfoTo;
import com.example.report.utils.SystemUtils;
import org.springframework.stereotype.Component;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */
@Component("SystemInfoReport")
public class SystemInfoReportDataCollect implements ReportDataCollect<SystemInfoTo> {
    @Override
    public SystemInfoTo collectReportData() {
        return SystemInfoTo.builder()
                .cpuUsage(SystemUtils.getData())
                .memoryUsage(SystemUtils.getData())
                .ioUsage(SystemUtils.getData())
                .build();
    }
}
