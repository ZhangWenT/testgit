/** 
 * <pre>项目名称:dubbo-coustomer 
 * 文件名称:StartCoustomer.java 
 * 包名:com.jk 
 * 创建日期:2018年8月8日下午10:11:23 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/** 
 * <pre>项目名称：dubbo-coustomer    
 * 类名称：StartCoustomer    
 * 类描述：    
 * 创建人：张文韬  
 * 创建时间：2018年8月8日 下午10:11:23    
 * 修改人：张文韬
 * 修改时间：2018年8月8日 下午10:11:23    
 * 修改备注：       
 * @version </pre>    
 */
@SpringBootApplication
@ImportResource("classpath:dubbo-coustomer.xml") //读取spring配置文件 相当于web.xml中的spring监听
public class StartCoustomer {
	//springboot项目使用main方法启动
    public static void main(String[] args) throws Exception {
    	//springboot启动命令 run方法中放入当前启动类的类名.class
        SpringApplication.run(StartCoustomer.class, args);
    }
}
