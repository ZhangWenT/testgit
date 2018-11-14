/** 
 * <pre>项目名称:dubbo-coustomer 
 * 文件名称:Car.java 
 * 包名:com.jk.model 
 * 创建日期:2018年11月13日下午7:58:37 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import java.io.Serializable;

/** 
 * <pre>项目名称：dubbo-coustomer    
 * 类名称：Car    
 * 类描述：    
 * 创建人：张文韬  
 * 创建时间：2018年11月13日 下午7:58:37    
 * 修改人：张文韬
 * 修改时间：2018年11月13日 下午7:58:37    
 * 修改备注：       
 * @version </pre>    
 */
public class Car implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer carid;
	
	private String carname;

	public Integer getCarid() {
		return carid;
	}

	public void setCarid(Integer carid) {
		this.carid = carid;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	

}
