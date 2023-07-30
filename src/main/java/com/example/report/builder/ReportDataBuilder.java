package com.example.report.builder;

import com.example.report.to.ReportChartTo;
import com.example.report.to.ReportDataTo;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/30
 */
public class ReportDataBuilder {
    private final ReportDataTo reportDataTo;
    public ReportDataBuilder() {
        this.reportDataTo = new ReportDataTo();
    }

    public ReportDataBuilder setQps(int qps) {
        reportDataTo.setQps(qps);
        return this;
    }

    public ReportDataBuilder setMaxCpuUsage(float maxCpu) {
        reportDataTo.setMaxCpuUsage(maxCpu);
        return this;
    }

    public ReportDataBuilder setMaxIoUsage(float ioUsage) {
        reportDataTo.setMaxIoUsage(ioUsage);
        return this;
    }

    public ReportDataBuilder setMaxMemory(float memory) {
        reportDataTo.setMaxIoUsage(memory);
        return this;
    }

    public ReportDataBuilder setReportChart(ReportChartTo chart) {
        if (Objects.isNull(reportDataTo.getReportChartTo())) {
            reportDataTo.setReportChartTo(new ArrayList<>());
        }
        reportDataTo.getReportChartTo().add(chart);
        return this;
    }

    public ReportDataTo build() {
        return reportDataTo;
    }
}
