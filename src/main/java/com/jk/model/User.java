/** 
 * <pre>项目名称:dubbo-provider 
 * 文件名称:User.java 
 * 包名:com.jk.model 
 * 创建日期:2018年8月9日上午12:09:45 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import java.io.Serializable;

/** 
 * <pre>项目名称：dubbo-provider    
 * 类名称：User    
 * 类描述：    
 * 创建人：张文韬  
 * 创建时间：2018年8月9日 上午12:09:45    
 * 修改人：张文韬
 * 修改时间：2018年8月9日 上午12:09:45    
 * 修改备注：       
 * @version </pre>    
 */
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer userid;
	
	private String username;
	
	private Integer userage;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getUserage() {
		return userage;
	}

	public void setUserage(Integer userage) {
		this.userage = userage;
	}
	
	

}
