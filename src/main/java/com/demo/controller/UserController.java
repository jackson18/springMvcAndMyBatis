package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.User;
import com.demo.service.UserService;
 
@Controller
@RequestMapping("/user/")
public class UserController {
 
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute("preloadUser")
	public User getUser(@RequestParam(value="id",required=false) Integer id) {
		if (id != null && !"".equals(id) && id != 0) {
			return userService.getUserByID(id);
		} else {
			return new User();
		}
	}
	
	@RequestMapping(value="list")
	public String list(Model model) {
		List<User> list = userService.getAllUser();
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping(value="create")
	public String create(@ModelAttribute("preloadUser") User entity, Model model) {
		model.addAttribute("entity", entity);
		return "add";
	}
	
	@RequestMapping(value="save")
	public String save(@ModelAttribute("preloadUser") User entity, Model model) {
		int result = userService.insertUser(entity);
		if (result == 1) {
			System.out.println("新增成功。");
		}
		return "redirect:/user/list";
	}
	
	@RequestMapping("preUpdate")
	public String preUpdate(@ModelAttribute("preloadUser") User entity,Model model){
		model.addAttribute("entity", entity);
		return "update";
	}
	
	@RequestMapping("update")
	public String update(@ModelAttribute("preloadUser") User entity,Model model){
		int result = userService.updateUser(entity);
		if (result == 1) {
			System.out.println("更新成功。");
		}
		return "redirect:/user/list";
	}
	
	@RequestMapping("delete")
	public String delete(@ModelAttribute("preloadUser") User entity,Model model){
		int result = userService.deleteUser(entity.getId());
		if (result == 1) {
			System.out.println("删除成功。");
		}
		return "redirect:/user/list";
	}
	
    
}