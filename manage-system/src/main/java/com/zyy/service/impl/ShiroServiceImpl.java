package com.zyy.service.impl;

import com.zyy.entity.SysUserEntity;
import com.zyy.entity.SysUserTokenEntity;
import com.zyy.service.ShiroService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ShiroServiceImpl implements ShiroService {

    @Override
    public Set<String> getUserPermissions(long userId) {
        /*List<String> permsList;

        //系统管理员，拥有最高权限
        if(userId == Constant.SUPER_ADMIN){
            List<SysMenuEntity> menuList = sysMenuDao.selectList(null);
            permsList = new ArrayList<>(menuList.size());
            for(SysMenuEntity menu : menuList){
                permsList.add(menu.getPerms());
            }
        }else{
            permsList = sysUserDao.queryAllPerms(userId);
        }
        */
        //用户权限列表
        Set<String> permsSet = new HashSet<>();
        //for(String perms : permsList){
        //    if(StringUtils.isBlank(perms)){
        //        continue;
        //    }
        String perms = "test:test";
        permsSet.addAll(Arrays.asList(perms.trim().split(",")));
        //}
        return permsSet;

    }

    @Override
    public SysUserTokenEntity queryByToken(String token) {
        int EXPIRE = 3600 * 12;
        Date now = new Date();
        return new SysUserTokenEntity()
                .setExpireTime(new Date(now.getTime() + EXPIRE * 1000))
                .setUserId(1L)
                ;
    }

    @Override
    public SysUserEntity queryUser(Long userId) {
        return new SysUserEntity()
                .setStatus(1)
                .setUserId(1L);
    }
}
