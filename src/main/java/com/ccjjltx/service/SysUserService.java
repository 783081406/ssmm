package com.ccjjltx.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.ccjjltx.dao.SysUserDao;
import com.ccjjltx.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ccj Date:2018/05/07 16:57
 * @version 1.0
 * @since JDK 1.8
 */
@Service
public class SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    //insert
    public int insert(SysUser sysUser) {
        return sysUserDao.insert(sysUser);
    }

    //update
    public int updateById(SysUser sysUser) {
        return sysUserDao.updateById(sysUser);
    }

    //deleteById
    public int deleteById(String id) {
        return sysUserDao.deleteById(id);
    }

    //selectById
    public SysUser selectById(String id) {
        return sysUserDao.selectById(id);
    }

    //List
    public List<SysUser> selectList(String name) {
        return sysUserDao.selectList(new EntityWrapper<SysUser>().eq("name", name));
    }

    //分页
    public List<SysUser> selectPage(int pageNumber, int rowNumber, String name) {
        return sysUserDao.selectPage(new Page(pageNumber, rowNumber), new EntityWrapper<SysUser>().eq("name", name));
    }
}
