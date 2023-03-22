package io.renren.modules.biz.service.impl;


import io.renren.modules.biz.dao.TeacherDao;
import io.renren.modules.biz.entity.TeacherVO;
import io.renren.modules.biz.service.TeacherService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Zhang Kai
 * @version 1.0
 * @description
 * @date 2023-03-20 11:37
 * @since 1.8
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;


    @Override
    public List<TeacherVO> getTeacherList(Integer id) {
        return teacherDao.getTeachers(id);
    }

    @Override
    public void addTeacher(TeacherVO vo) {
        teacherDao.addTeacher(vo);
    }

    @Override
    public void updateTeacherById(TeacherVO vo) throws Exception {
        List<TeacherVO> teachers = teacherDao.getTeachers(null);
        Optional<TeacherVO> optional = teachers.parallelStream().filter(i -> i.getId().equals(vo.getId())).findFirst();
        if (optional.isPresent()) {
            throw new Exception("该老师不存在！");
        }
        if(optional.get().getStatus().equals(1)){
            throw new Exception("该老师已经上线，无法修改！");
        }
        teacherDao.updateTeacherById(vo);
    }

}
