package com.example.report.collect;

import cn.hutool.log.Log;
import com.example.report.entity.SystemRunningInfo;
import com.example.report.enums.ReportDataTypeEnum;
import com.example.report.repository.SystemRunningInfoRepository;
import com.example.report.to.SystemInfoTo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */
@Component
public class ReportDataCollector {
    private static final Log log = Log.get();
    @Resource
    private SystemRunningInfoRepository systemRunningInfoRepository;


    public void collectReportData(long timestamp) {
        // 系统运行信息收集
        ReportDataCollect<SystemInfoTo> reportDataCollect = ReportDataCollectFactory.getInstance(ReportDataTypeEnum.SYSTEM_INFO);
        SystemInfoTo systemInfoTo = reportDataCollect.collectReportData();
        log.info("collect data is : {}", systemInfoTo);
        systemRunningInfoRepository.save(buildSystemRunningInfo(systemInfoTo, timestamp));
        // 业务运行信息采集
        ReportDataCollectFactory.getInstance(ReportDataTypeEnum.SYSTEM_INFO);
    }

    private SystemRunningInfo buildSystemRunningInfo(SystemInfoTo systemInfoTo, long timestamp) {
        SystemRunningInfo systemRunningInfo = new SystemRunningInfo();
        systemRunningInfo.setCpuUsage(systemInfoTo.getCpuUsage());
        systemRunningInfo.setIoUsage(systemInfoTo.getIoUsage());
        systemRunningInfo.setMemoryUsage(systemInfoTo.getMemoryUsage());
        systemRunningInfo.setCreateTime(timestamp);
        return systemRunningInfo;
    }
}
