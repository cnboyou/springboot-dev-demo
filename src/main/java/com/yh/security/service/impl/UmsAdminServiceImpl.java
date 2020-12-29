package com.yh.security.service.impl;

import com.yh.security.model.UmsAdmin;
import com.yh.security.model.UmsPermission;
import com.yh.security.service.UmsAdminService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: UmsAdminServiceImpl
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 18:14
 * @Description: TODO
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        return null;
    }

    @Override
    public List<UmsPermission> getPermissionList(Integer id) {
        return null;
    }
}