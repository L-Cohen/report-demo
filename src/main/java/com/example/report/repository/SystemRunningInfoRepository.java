package com.example.report.repository;

import com.example.report.entity.SystemRunningInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/28
 */
@Repository
public interface SystemRunningInfoRepository extends JpaRepository<SystemRunningInfo, Long>, JpaSpecificationExecutor<SystemRunningInfo> {
}
