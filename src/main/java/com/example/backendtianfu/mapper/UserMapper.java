package com.example.backendtianfu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.backendtianfu.entity.User;
import org.apache.ibatis.annotations.Mapper;


public interface UserMapper extends BaseMapper<User> {


//    //插入
//    @Insert("insert into `user` (username, password, name, phone, email, address, avatar) " +
//            "values (#{username}, #{password}, #{name}, #{phone}, #{email}, #{address}, #{avatar})")
//    void insert(User user);
//
//    //根据id修改
//    @Update("update `user` set username = #{username}, password = #{password}, name= #{name}, phone = #{phone}, " +
//            "email = #{email}, address = #{address}, avatar = #{avatar} where id = #{id}")
//    void updateUser(User user);
//
//    //删除
//    @Delete("delete from `user` where id = #{id}")
//    void deleteUser(Integer id);
//
//    //查询
//    @Select("select * from `user` order by id desc")
//    List<User> selectAll();
//
//    //id查询
//    @Select("select * from `user` where id = #{id} order by id desc")
//    User selectById(Integer id);
//
//    //名称查询
//    @Select("select * from `user` where name = #{name} order by id desc")
//    List<User> selectByName(String name);
//    //用户名称查询
//    @Select("select * from `user` where username = #{username} order by id desc")
//    User selectByUserName(String username);
//    //多参数查询
//    @Select("select * from `user` where username = #{username} and name = #{name} order by id desc")
//    List<User> selectByMore(@Param("username") String username, @Param("name") String name);
//
//    //模糊查询
//    @Select("select * from `user` where username like concat('%', #{username}, '%') and name like concat('%', #{name}, '%') order by id desc")
//    List<User> selectByMo( String username,  String name);
//
//    //分页查询
//    @Select("select * from `user` where username like concat('%', #{username}, '%') and name like concat('%', #{name}, '%') order by id desc limit #{skipNum}, #{pageSize}")
//    List<User> selectByPage(@Param("skipNum") Integer skipNum, @Param("pageSize")Integer pageSize, @Param("username") String username, @Param("name") String name);
//
//    @Select("select count(id) from `user` where username like concat('%', #{username}, '%') and name like concat('%', #{name}, '%') order by id desc")
//    int selectCountByPage(@Param("username") String username, @Param("name") String name);

}
