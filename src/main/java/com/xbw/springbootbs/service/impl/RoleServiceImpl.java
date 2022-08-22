package com.xbw.springbootbs.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xbw.springbootbs.entity.Role;
import com.xbw.springbootbs.entity.RoleMenu;
import com.xbw.springbootbs.mapper.RoleMapper;
import com.xbw.springbootbs.mapper.RoleMenuMapper;
import com.xbw.springbootbs.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xbw
 * @since 2022-07-27
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Resource
    private RoleMenuMapper roleMenuMapper;
    @Transactional
    @Override
    public void setRoleMenu(Integer roleId, List<Integer> menuIds){
//        QueryWrapper<RoleMenu> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("role_id",roleId);
//        roleMenuMapper.delete(queryWrapper);
        roleMenuMapper.deleteByRoleId(roleId);

        for(Integer menuId : menuIds){
            RoleMenu roleMenu = new RoleMenu();
            roleMenu.setRoleId(roleId);
            roleMenu.setMenuId(menuId);
            roleMenuMapper.insert(roleMenu);
        }
    }

    @Override
    public List<Integer> getRoleMenu(Integer roleId) {
        return roleMenuMapper.selectByRoleId(roleId);
    }
}
