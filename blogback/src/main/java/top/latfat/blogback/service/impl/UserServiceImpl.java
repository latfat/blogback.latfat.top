package top.latfat.blogback.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import top.latfat.blogback.entity.User;
import top.latfat.blogback.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

}
