package com.bdqn.t0724.mapper;

import com.bdqn.t0724.model.LoginInfo;
import java.util.List;

public interface LoginInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoginInfo record);

    LoginInfo selectByPrimaryKey(Long id);

    List<LoginInfo> selectAll();

    int updateByPrimaryKey(LoginInfo record);
}