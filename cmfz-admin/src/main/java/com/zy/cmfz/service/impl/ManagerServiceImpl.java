package com.zy.cmfz.service.impl;

import com.zy.cmfz.dao.ManagerDao;
import com.zy.cmfz.entity.Manager;
import com.zy.cmfz.service.ManagerService;
import com.zy.cmfz.utils.ManagerUtils;
import com.zy.cmfz.utils.UUIDToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Author:zy
 * @Date: 2018-07-04 17:01
 * @Description:
 */
@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerDao managerDao;


    /**
     * 增加管理员
     * @param mgr
     * @return
     */
    @Override
    public int add(Manager mgr) {
        mgr.setMgrSalt(ManagerUtils.getSalt());
        mgr.setMgrId(UUIDToString.getUUID());
        mgr.setMgrStatus("1");
        mgr.setMgrPassword(ManagerUtils.passwordMd5(mgr.getMgrPassword(),mgr.getMgrSalt()));
        return managerDao.insert(mgr);
    }

    /**
     * 删除管理员
     * @param id
     * @return
     */
    @Override
    public int remove(String id) {
        return managerDao.delete(id);
    }

    /**
     * 修改信息
     * @param mgr
     * @return
     */
    @Override
    public int modify(Manager mgr) {
        return managerDao.update(mgr);
    }

    /**
     * 登录验证
     * @param name
     * @param password
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED , propagation = Propagation.SUPPORTS, readOnly = true)
    public Manager queryByName(String name, String password) {
        Manager mgr = managerDao.selectByName(name);
        if(mgr == null){
            return null;
        }else {
            if(mgr.getMgrPassword().equals( ManagerUtils.passwordMd5( password , mgr.getMgrSalt() ) ) ){
                return mgr;
            }else{
                return null;
            }
        }
    }

    /**
     * 注册验证
     * @param name
     * @return
     */
    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED , propagation = Propagation.SUPPORTS, readOnly = true)
    public Manager queryByName(String name) {
        return  managerDao.selectByName(name);
    }
}
