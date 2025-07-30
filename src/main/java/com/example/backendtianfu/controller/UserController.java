package com.example.backendtianfu.controller;


import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.backendtianfu.common.Result;
import com.example.backendtianfu.entity.User;

import com.example.backendtianfu.exception.ServiceException;
import com.example.backendtianfu.service.UserSercive;
import com.example.backendtianfu.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserSercive userService;
    /**
     * 新增用户信息
     */
    @PostMapping("/add")
    public Result add(@RequestBody User user) {
        try{
            userService.save(user);
        }catch (Exception e){
            if(e instanceof DuplicateKeyException){
                return Result.error("插入数据库出错");
            }else {
                return Result.error("系统错误");
            }
        }
        return Result.success();
    }

    /**
     * 修改用户信息
     */
    @PutMapping("/update")
    public Result update(@RequestBody User user) {
        userService.updateById(user);
        return Result.success();
    }
    /**
     * 删除用户信息
     */
    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        User currentUser = TokenUtils.getCurrentUser();
        if (id.equals(currentUser.getId())) {
            throw new ServiceException("不能删除当前的用户");
        }
        userService.removeById(id);
        return Result.success();
    }
    /**
     * 批量删除用户信息
     */
    @DeleteMapping("/delete/batch")
    public Result batchDelete(@RequestBody List<Integer> ids) {  //  [7, 8]
        User currentUser=TokenUtils.getCurrentUser();
    if(currentUser!=null&& currentUser.getId()!=null && ids.contains(currentUser.getId())){
        throw new ServiceException("不能删除当前用户");
    }
        userService.removeBatchByIds(ids);
        return Result.success();
    }

    /**
     * 查询全部用户信息
     */
    @GetMapping("/selectAll")
    public Result selectAll() {
        List<User> userList = userService.list(new QueryWrapper<User>().orderByDesc("id"));
        return Result.success(userList);
    }
    /**
     * 根据ID查询用户信息
     */
    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id) {
        User user = userService.getById(id);
        return Result.success(user);
    }


    /**
     * 多条件分页模糊查询用户信息
     * pageNum 当前的页码
     * pageSize 每页查询的个数
     */
    @GetMapping("/selectByPage")
    public Result selectByPage(@RequestParam Integer pageNum,
                               @RequestParam Integer pageSize,
                               @RequestParam String username,
                               @RequestParam String name) {
        QueryWrapper<User> queryWrapper= new QueryWrapper<User>().orderByDesc("id");
        queryWrapper.like(StrUtil.isNotBlank(username),"username",username);
        queryWrapper.like(StrUtil.isNotBlank(name),"name",name);
        Page<User> page=userService.page(new Page<>(pageNum,pageSize),queryWrapper);
        return Result.success(page);
    }
}
