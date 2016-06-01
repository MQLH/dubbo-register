package com.hq.register.service;

import java.util.List;

import com.hq.register.pojo.User;

/**
 * Description: zookepper中的注册服务
 *
 * ClassName:DemoService Date: 2016年5月30日 下午5:32:03
 * 
 * @author lihao.qiu
 * @version
 * @since JDK 1.8 Copyright (c) 2016, o2o-lottery All Rights Reserved.
 */
public interface DubboService {
	/**
	 * function: 说Hello.....
	 *   
	 * @param name
	 * @return   
	 * @since JDK 1.8
	 */
	String sayHello(String name);

	/**
	 * function: 得到一个User的列表
	 *   
	 * @return   
	 * @since JDK 1.8
	 */
	public List<User> getUsers();
}
