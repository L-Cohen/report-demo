package com.example.report.to;

import com.example.report.enums.ReportChartTypeEnum;
import lombok.Data;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/29
 */
@Data
public class ReportChartTo {
    private ReportChartTypeEnum chartType;
    private double[] xData;
    private double[] yData;
}
