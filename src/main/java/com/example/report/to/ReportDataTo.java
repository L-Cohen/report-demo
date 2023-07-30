package com.example.report.to;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/29
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ReportDataTo extends ReportCreateTo {
    private int qps;
    private float maxCpuUsage;
    private float maxMemoryUsage;
    private float maxIoUsage;
    private List<ReportChartTo> reportChartTo;
}
