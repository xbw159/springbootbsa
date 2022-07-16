package com.xbw.springbootbs.mapper;

import com.xbw.springbootbs.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author xbw
 * @since 2022-07-14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
