/** 
 * <pre>项目名称:dubbo-coustomer 
 * 文件名称:UserController.java 
 * 包名:com.jk.controller 
 * 创建日期:2018年8月9日上午1:37:47 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jk.model.Car;
import com.jk.model.User;
import com.jk.service.UserService;

/** 
 * <pre>项目名称：dubbo-coustomer    
 * 类名称：UserController    
 * 类描述：    
 * 创建人：张文韬  
 * 创建时间：2018年8月9日 上午1:37:47    
 * 修改人：张文韬
 * 修改时间：2018年8月9日 上午1:37:47    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
//	@Autowired
//	private  RedisTemplate redisTemplate;
//	
//	@Autowired
//	private ListOperations hellolistops;
	
	
	@RequestMapping("saveUser")
	public void saveUser(User user){
		userService.insertUser(user);
		System.out.println(1);
	}
	
	@RequestMapping("deleteUser")
	public void deleteUser(User user){
		userService.deleteUser(user);
	}
	
	@RequestMapping("editUser")
	public void editUser(User user){
		userService.editUser(user);
	}
	
	@RequestMapping("queryUser")
	@ResponseBody
	public List<User> queryUser(){
		List<User> list = userService.queryUser();
		return list;
	}
	
	@RequestMapping("saveCar")
	public void saveCar(){
		Car car = new Car();
		car.setCarid(1);
		car.setCarname("奔驰");
		mongoTemplate.save(car);
	}
	
	@RequestMapping("queryAllCar")
	public void queryAll(){
		List<Car> list = mongoTemplate.findAll(Car.class);
		for (Car car : list) {
			System.err.println(car.getCarname());
		}
	}
	
	@RequestMapping("updateCar")
	public void updateCar(){
		Query query = new Query();
		Criteria criteria = Criteria.where("carid").is(1);
		query.addCriteria(criteria);
		mongoTemplate.updateMulti(query, new Update().set("username", "雪弗来"), Car.class);
	}
	
	@RequestMapping("daleteCar")
	public void daleteCar(){
		Query query = new Query();
		Criteria criteria = Criteria.where("carid").is(1);
		query.addCriteria(criteria);
		mongoTemplate.remove(query, Car.class);
	}
	
//	@RequestMapping("addHello")
//	public void addHello(String id, String hello) {
//    hellolistops.leftPush(id, hello);
//   //System.out.println(l);
//   }
//	
//	@RequestMapping("delHello")
//   public void delHello(String id) {
//       redisTemplate.delete(id);
//   }
//   
//	@RequestMapping("modHello")
//   public void modHello(String id, String hello_mod) {
//       redisTemplate.delete(id);
//       hellolistops.leftPush(id, hello_mod);
//   }
//   
//	@RequestMapping("getHello")
//   public String getHello(String id) {
//       return hellolistops.range(id, 0, -1).toString();
//   }

}
