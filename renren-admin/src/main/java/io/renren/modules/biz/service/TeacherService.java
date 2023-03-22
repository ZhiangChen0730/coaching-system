package io.renren.modules.biz.service;

import io.renren.modules.biz.entity.TeacherVO;

import java.util.List;

/**
 * @author Zhang Kai
 * @version 1.0
 * @description
 * @date 2023-03-20 11:13
 * @since 1.8
 */
public interface TeacherService {
    List<TeacherVO> getTeacherList(Integer id);
    void addTeacher(TeacherVO vo);
    void updateTeacherById(TeacherVO vo) throws Exception;
}
