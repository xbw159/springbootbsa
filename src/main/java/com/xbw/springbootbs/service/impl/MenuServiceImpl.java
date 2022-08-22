package com.xbw.springbootbs.service.impl;

import com.xbw.springbootbs.entity.Menu;
import com.xbw.springbootbs.mapper.MenuMapper;
import com.xbw.springbootbs.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xbw
 * @since 2022-07-27
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

}
