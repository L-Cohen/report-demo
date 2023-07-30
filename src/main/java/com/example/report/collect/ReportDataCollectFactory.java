package com.example.report.collect;

import com.example.report.enums.ReportDataTypeEnum;
import com.example.report.utils.SpringContextUtil;
import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Optional;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */
@SuppressWarnings("unchecked")
public class ReportDataCollectFactory {
    private static final Map<ReportDataTypeEnum, ReportDataCollect<?>> REPORT_DATA_COLLECT_MAP = Maps.newHashMap();

    static {
        REPORT_DATA_COLLECT_MAP.put(ReportDataTypeEnum.SYSTEM_INFO, (ReportDataCollect<?>) SpringContextUtil.getBean("SystemInfoReport"));
        REPORT_DATA_COLLECT_MAP.put(ReportDataTypeEnum.BUSINESS_INFO, (ReportDataCollect<?>) SpringContextUtil.getBean("BusinessInfoReport"));
    }

    public static <T> ReportDataCollect<T> getInstance(ReportDataTypeEnum reportDataType) {
        return (ReportDataCollect<T>) Optional.ofNullable(REPORT_DATA_COLLECT_MAP.get(reportDataType))
                .orElseThrow(() -> new IllegalArgumentException("unsupported report data type"));
    }
}
