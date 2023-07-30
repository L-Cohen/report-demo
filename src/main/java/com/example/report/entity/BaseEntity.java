package com.example.report.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */
@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "create_time")
    private Long createTime;
}
