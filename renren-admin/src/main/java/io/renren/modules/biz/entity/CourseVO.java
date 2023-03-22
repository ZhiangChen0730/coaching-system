package io.renren.modules.biz.entity;

import lombok.Data;

/**
 * @author Zhang Kai
 * @version 1.0
 * @description 课程信息VO
 * @date 2023-03-22 10:30
 * @since 1.8
 */
@Data
public class CourseVO {
    private Integer id;
    private String teacherName;
    private Integer teacherId;
    private String subject;
    private String name;
    private String startDate;
    private String endDate;
    private String content;
}
