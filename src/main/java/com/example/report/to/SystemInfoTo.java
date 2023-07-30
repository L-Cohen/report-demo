package com.example.report.to;

import lombok.Builder;
import lombok.Data;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */
@Data
@Builder
public class SystemInfoTo {
    private Float cpuUsage;
    private Float ioUsage;
    private Float memoryUsage;
}
