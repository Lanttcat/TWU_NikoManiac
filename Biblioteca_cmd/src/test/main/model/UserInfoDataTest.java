package test.main.model; 

import main.model.UserInfoData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** 
* UserInfoData Tester. 
* 
* @author <Authors name> 
* @since <pre>07/19/2018</pre> 
* @version 1.0 
*/ 
public class UserInfoDataTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getNormalUser() 
* 
*/ 
@Test
public void testGetNormalUser() throws Exception { 
//TODO: Test goes here...
    String pwd = UserInfoData.getNormalUser().getUserPassward();
    assertEquals("test001", pwd);
} 

/** 
* 
* Method: getManageUser() 
* 
*/ 
@Test
public void testGetManageUser() throws Exception { 
//TODO: Test goes here... 
} 


} 
