package com.zy.cmfz.dao;

import com.zy.cmfz.entity.Manager;

/**
 * @Author:zy
 * @Date: 2018-07-04 15:56
 * @Description:
 */

public interface ManagerDao {
    /**
     * 管理员注册
     * @param mgr
     * @return
     */
    public int insert(Manager mgr);

    /**
     * 删除管理员
     * @param id
     * @return
     */
    public int delete(String id);

    /**
     * 修改管理员信息
     * @param mgr
     * @return
     */
    public int update(Manager mgr);

    /**
     * 查看管理员
     * @param name
     * @return
     */
    public Manager selectByName(String name);
}
