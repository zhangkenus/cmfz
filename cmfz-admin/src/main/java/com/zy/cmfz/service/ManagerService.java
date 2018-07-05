package com.zy.cmfz.service;

import com.zy.cmfz.entity.Manager;

/**
 * @Author:zy
 * @Date: 2018-07-04 16:14
 * @Description: 管理员service
 */
public interface ManagerService {
    /**
     * 增加管理员
     * @param mgr
     * @return
     */
    public int add(Manager mgr);

    /**
     * 删除管理员信息
     * @param id
     * @return
     */
    public int remove(String id);

    /**
     * 修改管理员信息
     * @param mgr
     * @return
     */
    public int modify(Manager mgr);

    /**
     * 查询
     * @param name
     * @param password
     * @return
     */
    public Manager queryByName(String name, String password);

    /**
     * 验证用户名是否已经注册过
     * @param name
     * @return
     */
    public Manager queryByName(String name);
}
