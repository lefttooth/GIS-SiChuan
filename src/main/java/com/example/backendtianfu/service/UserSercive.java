package com.example.backendtianfu.service;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.backendtianfu.entity.User;
import com.example.backendtianfu.exception.ServiceException;
import com.example.backendtianfu.mapper.UserMapper;
import com.example.backendtianfu.utils.TokenUtils;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;


@Service
public class UserSercive extends ServiceImpl<UserMapper, User> {
    @Resource
    UserMapper userMapper;



    @Override
    public boolean save(User entity){
        if(StrUtil.isBlank(entity.getName())){
            entity.setName(entity.getUsername());
        }

        if(StrUtil.isBlank(entity.getPassword())){
            entity.setPassword("123");
        }
        if(StrUtil.isBlank(entity.getRole())){
            entity.setPassword("用户"); //默认角色用户
        }
        return super.save(entity);
    }
    //mybatis查询器
    public User selectByUserName(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        return getOne(queryWrapper);
    }

    //验证用户数据是否合法
    public User login(User user) {
        User dbUser = selectByUserName(user.getUsername());
        if (dbUser == null) {
            //抛出异常
            throw new ServiceException("用户名或密码错误");
        }
        if (!user.getPassword().equals(dbUser.getPassword())) {
            throw new ServiceException("用户名或密码错误");
        }
        //    生成Token
        String token = TokenUtils.createToken(dbUser.getId().toString(), dbUser.getPassword());
        dbUser.setToken(token);
        return dbUser;
    }

    public User register(User user) {
        User dbUser = selectByUserName(user.getUsername());
        if (dbUser != null) {
            throw new ServiceException("该用户已经存在");
        }
        user.setName(user.getUsername());
        userMapper.insert(user);
        return user;
    }

    //  Service代码：
    public void resetPassword(User user) {
        User dbUser = selectByUserName(user.getUsername());
        if (dbUser == null) {
            // 抛出一个自定义的异常
            throw new ServiceException("用户不存在");
        }
        if (!user.getPhone().equals(dbUser.getPhone())) {
            throw new ServiceException("验证错误");
        }
        dbUser.setPassword("123");   // 重置密码
        updateById(dbUser);
    }
    //    public void insertUser(User user) {
//        userMapper.insert(user);
//    }
//
//    public void updateUser(User user) {
//        userMapper.updateUser(user);
//    }
//
//    public void deleteUser(Integer id) {
//        userMapper.deleteUser(id);
//    }
//
//    public void batchDeleteUser(List<Integer> ids) {
//        for (Integer id : ids) {
//            userMapper.deleteUser(id);  // 7  - 8
//        }
//    }
//
//    public List<User> selectAll() {
//        return userMapper.selectAll();
//    }
//
//    public User selectById(Integer id) {
//        return userMapper.selectById(id);
//    }
//    public List<User> selectByName(String name) {
//        return userMapper.selectByName(name);
//    }
//    //多条件查询
//    public List<User> selectByMore(String username,String name){
//        return userMapper.selectByMore(username,name);
//    }
//
//    //模糊查询
//    public List<User> selectByMo(String username,String name){
//        return userMapper.selectByMo(username,name);
//    }
//    //分页查询
//    public Page<User> selectByPage(Integer pageNum, Integer pageSize, String username, String name) {
//        Integer skipNum = (pageNum - 1) * pageSize;  // 计算出来  1 -> 0,5    2 -> 5,5   3 -> 10,5
//
//        Page<User> page = new Page<>();
//        List<User> userList = userMapper.selectByPage(skipNum, pageSize, username, name);
//        Integer total = userMapper.selectCountByPage(username, name);
//        page.setTotal(total);
//        page.setList(userList);
//        return page;
//    }
}
