package com.xbw.springbootbs.service;

import com.xbw.springbootbs.controller.dto.UserDto;
import com.xbw.springbootbs.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xbw
 * @since 2022-07-14
 */
public interface IUserService extends IService<User> {

    UserDto login(UserDto userDto);

    User register(UserDto userDto);
}
