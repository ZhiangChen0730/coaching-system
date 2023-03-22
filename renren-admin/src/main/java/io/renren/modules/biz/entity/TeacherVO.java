package io.renren.modules.biz.entity;

import lombok.Data;

/**
 * @author Zhang Kai
 * @version 1.0
 * @description 老师管理VO
 * @date 2023-03-20 10:18
 * @since 1.8
 */
@Data
public class TeacherVO {
    private Integer id;
    private String name;
    private String icon;
    private String subject;
    private String gender;
    private String email;
    private String mobile;
    private String content;
    private Integer skillLevel;
    private Integer serviceLevel;
    private Integer status;
}
