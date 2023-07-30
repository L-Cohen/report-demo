package com.example.report.collect.impl;

import com.example.report.collect.ReportDataCollect;
import com.example.report.to.BusinessInfoTo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */
@Component("BusinessInfoReport")
public class BusinessInfoReportDataCollect implements ReportDataCollect<BusinessInfoTo> {
    @Resource


    @Override
    public BusinessInfoTo collectReportData() {
        return BusinessInfoTo.builder()
                .qps(getData())
                .build();
    }

    private int getData() {
        return (int) (Math.random() * 1000 - 1);
    }
}
