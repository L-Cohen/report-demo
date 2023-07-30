package com.example.report.enums;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */
public enum ReportDataTypeEnum {
    SYSTEM_INFO("SystemInfoReport"),
    BUSINESS_INFO("BusinessInfoReport"),
    ;


    private final String type;

    ReportDataTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
