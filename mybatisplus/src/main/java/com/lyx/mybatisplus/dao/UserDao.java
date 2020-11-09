package com.lyx.mybatisplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyx.mybatisplus.entity.ProductVO;
import com.lyx.mybatisplus.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author : lyx
 * @Date : 2020/10/25 11:41
 * @Version : 1.0
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

    /**
     * 自定义的SQL
     *
     * @param id
     * @return
     */
    @Select("select b.*,a.user_name from user a,product b where a.user_id = b.user_id and b.user_id = #{id}")
    List<ProductVO> productList(Integer id);

    /**
     * 按照id查询
     *
     * @param userId
     * @return
     */

    @Select("select * from user where user_id = #{user_id} and deleted = 0")
    User selectByIdd(@Param("user_id") Integer userId);




}
