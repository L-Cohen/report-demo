package com.example.report.generator.impl;

import com.example.report.builder.ReportDataBuilder;
import com.example.report.entity.SystemRunningInfo;
import com.example.report.generator.ReportDataGenerator;
import com.example.report.repository.SystemRunningInfoRepository;
import com.example.report.to.ReportCreateTo;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/30
 */
@Component
public class SystemInfoDataGenerator implements ReportDataGenerator {

    @Resource
    private SystemRunningInfoRepository systemRunningInfoRepository;

    @Override
    public ReportDataBuilder getReportData(ReportCreateTo reportCreateTo) {
        List<SystemRunningInfo> systemReportDataList = systemRunningInfoRepository.findAll(getSpecification(reportCreateTo));
        // 1.max cpu
        Float cpu = systemReportDataList.stream().map(SystemRunningInfo::getCpuUsage).max(Float::compareTo).orElse(0f);
        // io
        Float io = systemReportDataList.stream().map(SystemRunningInfo::getIoUsage).max(Float::compareTo).orElse(0f);
        Float memory = systemReportDataList.stream().map(SystemRunningInfo::getMemoryUsage).max(Float::compareTo).orElse(0f);
        return new ReportDataBuilder();
    }

    private Specification<SystemRunningInfo> getSpecification(ReportCreateTo reportCreateTo) {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            predicates.add(cb.between(root.get("createTime"), reportCreateTo.getStartTime(), reportCreateTo.getEndTime()));
            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}
