package ck.tyut.first.mapper;

import ck.tyut.first.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);
    User selectByUserId(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}