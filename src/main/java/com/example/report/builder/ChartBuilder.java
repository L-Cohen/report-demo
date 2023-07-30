package com.example.report.builder;

import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */
public class ChartBuilder {

    private final XYChart chart;


    public ChartBuilder(int width, int height, String title) {
        this.chart = new XYChartBuilder()
                .width(width)
                .height(height)
                .title(title)
                .build();
    }

    public ChartBuilder addSeries(String seriesName, double[] xData, double[] yData) {
        chart.addSeries(seriesName, xData, yData);
        return this;
    }

    public XYChart build() {
        return chart;
    }

}
