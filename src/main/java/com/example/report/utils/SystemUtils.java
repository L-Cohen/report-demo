package com.example.report.utils;

import java.util.Random;

/**
 * @author ryf
 * @version 1.0
 * @project report-demo
 * @description
 * @date 2023/7/29
 */
public class SystemUtils {

    /**
     * 具体获取系统运行数据的地方
     * @return 系统运行数据
     *
     */
    public static float getData() {
        float min = 1f;
        float max = 100f;
        return min + new Random().nextFloat() * (max - min);
    }
}
