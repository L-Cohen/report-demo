package com.example.report.generator;

import com.example.report.builder.ReportDataBuilder;
import com.example.report.to.ReportCreateTo;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/29
 */
public interface ReportDataGenerator {
    ReportDataBuilder getReportData(ReportCreateTo reportCreateTo);
}
