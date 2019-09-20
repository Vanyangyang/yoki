package org.lanqiao.yk.service;

import org.lanqiao.yk.entity.UserInfo;

public interface LoginService {
    UserInfo login(String telephone, String email);
    UserInfo login(String telephone);
    int logon(Long telephone, String userName, String password);
    int upPwd(Long telephone,String password);
}
