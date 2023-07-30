package com.example.report.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */

@Data
@Table(name = "t_system_running_info")
@Entity
public class SystemRunningInfo extends BaseEntity {
    @Column(name = "cpu_usage")
    private Float cpuUsage;
    @Column(name = "io_usage")
    private Float ioUsage;
    @Column(name = "memory_usage")
    private Float memoryUsage;
}
