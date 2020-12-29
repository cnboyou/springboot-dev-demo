package com.yh.security.service;

import com.yh.security.model.UmsAdmin;
import com.yh.security.model.UmsPermission;

import java.util.List;

/**
 * ClassName: UmsAdminService
 *
 * @Author: WangYiHai
 * @Date: 2020/12/29 18:00
 * @Description: TODO
 */
public interface UmsAdminService {

    UmsAdmin getAdminByUsername(String username);

    List<UmsPermission> getPermissionList(Integer id);
}