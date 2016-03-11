package top.latfat.blogback.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import top.latfat.blogback.dao.UserDao;
import top.latfat.blogback.entity.User;
/**
 * 
 * @author sean
 *
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public User findByName(String name) {
		List<User> user = findByHQL("from User u where u.name=?", name);
		Iterator<User> iterator = user.iterator();
		while (iterator.hasNext()) {
			User u = (User) iterator.next();
			System.out.println(u);
			return u;
		}
		return null;
	}


}
