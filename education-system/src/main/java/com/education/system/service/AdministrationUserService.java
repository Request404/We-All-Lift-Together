package com.education.system.service;

import com.education.system.entity.AdminAccount;

public interface AdministrationUserService extends BaseUserService<AdminAccount,Object> {

    public AdminAccount queryAdministrationInfo(Integer adminId);
}
