package com.my.sample.multidatasource.service.impl;

import com.my.sample.multidatasource.entity.po.User;
import com.my.sample.multidatasource.dao.mapper.primary.UserMapper;
import com.my.sample.multidatasource.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shiyongbiao
 * @since 2018-11-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
