/** 
 * <pre>项目名称:dubbo-provider 
 * 文件名称:BookService.java 
 * 包名:com.jk.service 
 * 创建日期:2018年8月9日上午12:49:41 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service;

import java.util.List;

import com.jk.model.User;

/** 
 * <pre>项目名称：dubbo-provider    
 * 类名称：BookService    
 * 类描述：    
 * 创建人：张文韬  
 * 创建时间：2018年8月9日 上午12:49:41    
 * 修改人：张文韬
 * 修改时间：2018年8月9日 上午12:49:41    
 * 修改备注：       
 * @version </pre>    
 */
public interface UserService {
	
	void insertUser(User user);

	/** <pre>deleteUser(这里用一句话描述这个方法的作用)   
	 * 创建人：张文韬
	 * 创建时间：2018年11月13日 下午7:46:08    
	 * 修改人：张文韬
	 * 修改时间：2018年11月13日 下午7:46:08    
	 * 修改备注： 
	 * @param user</pre>    
	 */
	void deleteUser(User user);

	/** <pre>editUser(这里用一句话描述这个方法的作用)   
	 * 创建人：张文韬
	 * 创建时间：2018年11月13日 下午7:47:52    
	 * 修改人：张文韬
	 * 修改时间：2018年11月13日 下午7:47:52    
	 * 修改备注： 
	 * @param user</pre>    
	 */
	void editUser(User user);

	/** <pre>queryUser(这里用一句话描述这个方法的作用)   
	 * 创建人：张文韬
	 * 创建时间：2018年11月13日 下午7:51:09    
	 * 修改人：张文韬
	 * 修改时间：2018年11月13日 下午7:51:09    
	 * 修改备注： 
	 * @param user
	 * @return</pre>    
	 */
	List<User> queryUser();

}
