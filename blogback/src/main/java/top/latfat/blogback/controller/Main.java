package top.latfat.blogback.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.latfat.blogback.entity.Result;
import top.latfat.blogback.entity.User;
import top.latfat.blogback.service.UserService;
/**
 * 测试用
 * @author sean
 *
 */
@Controller
public class Main {
	
	@Resource
	private UserService service;

	@RequestMapping("/login.do")
	@ResponseBody
	public Result login(User guest, HttpSession session) {
		Result result = service.checkLogin(guest);
		if (result.getStatus() == 1) {
			session.setAttribute("user", result.getData());
		}
		result.setData(null);
		return result;
	}
	
	@RequestMapping("/regist.do")
	@ResponseBody
	public Result save(User guest) {
		Result result = service.checkLogin(guest);
		if (result.getStatus() != 0) {
			if (result.getData() != null) {
				return result.setAll(0, "用户名已被占用！", null);
			}
			return result;
		}
		return service.save(guest);
	}
}
