package top.latfat.blogback.service;

import top.latfat.blogback.entity.Result;
import top.latfat.blogback.entity.User;
/**
 * 特有服务放在此
 * @author xiaochen@inshn
 *
 */
public interface UserService extends BaseService<User> {

	Result checkLogin(User guest);

}
