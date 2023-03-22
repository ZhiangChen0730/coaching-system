package io.renren.modules.biz.dao;

import io.renren.modules.biz.entity.TeacherVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Zhang Kai
 * @version 1.0
 * @description
 * @date 2023-03-20 11:12
 * @since 1.8
 */
@Mapper
public interface TeacherDao {


    List<TeacherVO> getTeachers(Integer id);

    void addTeacher(TeacherVO vo);

    void updateTeacherById(TeacherVO vo);

    Integer getTeacherStatusById(Integer id);
}
