package com.hq.register.pojo;

import java.io.Serializable;


/**
 * Description: 注册服务中的实体（必须实现Serializable接口，因为转为传输方式为RPC协议，RPC不支持对象传递，只支持流传递）
 *
 * ClassName:User Date: 2016年5月30日 下午5:33:02
 * 
 * @author lihao.qiu
 * @version
 * @since JDK 1.8 Copyright (c) 2016, o2o-lottery All Rights Reserved.
 */
public class User implements Serializable {
	private static final long serialVersionUID = 9217440822721902917L;
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 性别
	private String sex;
	
	@Override
	public String toString() {
		return "name : " + name + "\t age : " + age + "\t sex : " + sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
