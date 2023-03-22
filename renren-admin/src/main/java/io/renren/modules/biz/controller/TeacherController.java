package io.renren.modules.biz.controller;


import io.renren.common.constant.Constant;
import io.renren.common.utils.Result;
import io.renren.modules.biz.entity.TeacherVO;
import io.renren.modules.biz.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.util.annotation.Nullable;


import java.util.List;

/**
 * @author Zhang Kai
 * @version 1.0
 * @description 老师管理
 * @date 2023-03-20 10:15
 * @since 1.8
 */
@Slf4j
@RestController
@RequestMapping("/biz/teacher")
@Api(tags="老师管理")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    /**
     * 查询老师列表           url:/renren-admin/biz/teacher/query
     * @param id 老师Id
     * @return
     */
    @GetMapping("query")
    @ApiOperation("查询老师列表")
    public Result<List<TeacherVO>> list(@Nullable Integer  id){
        List<TeacherVO> list = teacherService.getTeacherList(id);
        return new Result<List<TeacherVO>>().ok(list);
    }

    /**
     * 新增老师信息           url:/renren-admin/biz/teacher/add
     * @param vo
     * @return
     */
    @PostMapping("add")
    @ApiOperation("新增老师信息")
    public Result add(TeacherVO vo){
         teacherService.addTeacher(vo);
        return new Result();
    }

    @PostMapping("update")
    @ApiOperation("更新老师信息")
    public Result<?> update(TeacherVO vo)  {
        String errorMsg = StringUtils.EMPTY;
        try {
            teacherService.updateTeacherById(vo);
        } catch (Exception e) {
            log.info("更新老师信息出现异常", e);
            //result.error(Constant.ERROR_MSG);
        }
        return null;
    }
}
