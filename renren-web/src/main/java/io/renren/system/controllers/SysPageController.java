package io.renren.system.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统页面视图
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年11月24日 下午11:05:27
 */
@Controller
public class SysPageController {
	
	@RequestMapping("sys/{url}.html")
	public String page(@PathVariable("url") String url){
		return "sys/" + url + ".html";
	}

	@RequestMapping("generator/{url}.html")
	public String generator(@PathVariable("url") String url){
		return "generator/" + url + ".html";
	}
	
	@RequestMapping("personel/{url}.html")
	public String personel(@PathVariable("url") String url){
		return "personel/" + url + ".html";
	}
	
	@RequestMapping("course/{url}.html")
	public String course(@PathVariable("url") String url){
		return "course/" + url + ".html";
	}
	
	@RequestMapping("fin/{url}.html")
	public String fin(@PathVariable("url") String url){
		return "fin/" + url + ".html";
	}
}
