package com.ccjjltx.controller;

import com.ccjjltx.entity.SysUser;
import com.ccjjltx.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ccj Date:2018/05/07 16:57
 * @version 1.0
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/select")
    @ResponseBody
    public String select(String id) {
        return sysUserService.selectById(id).getName();
    }

    @RequestMapping("/selectlist")
    @ResponseBody
    public int selectList(String name) {
        return sysUserService.selectList(name).size();
    }

    @RequestMapping("/selectpage")
    @ResponseBody
    public int selectList(int pageNumber, int rowNumber, String name) {
        return sysUserService.selectPage(pageNumber, rowNumber, name).size();
    }

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(SysUser sysUser) {
        return sysUserService.insert(sysUser);
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(SysUser sysUser) {
        return sysUserService.updateById(sysUser);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int deleteById(String id) {
        return sysUserService.deleteById(id);
    }
}
