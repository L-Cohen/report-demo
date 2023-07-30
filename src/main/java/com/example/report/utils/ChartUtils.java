package com.example.report.utils;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.XYChart;

import java.io.IOException;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */
public class ChartUtils {
    public static void generateChartPng(String fileName, XYChart chart) throws IOException {
        BitmapEncoder.saveBitmap(chart, fileName, BitmapEncoder.BitmapFormat.PNG);
    }
}
