package test.main.controller;

import main.controller.MainController;
import main.model.UserInfoData;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/** 
* MainController Tester. 
* 
* @author <Authors name> 
* @since <pre>07/20/2018</pre> 
* @version 1.0 
*/ 
public class MainControllerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: welocomeView()
     */
    @Test
    public void testWelocomeView() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: toBookDetail(String input)
     */
    @Test
    public void testToBookDetail() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setToArray(LinkedHashSet data)
     */
    @Test
    public void testSetToArray() throws Exception {
//TODO: Test goes here... 
    }


    /**
     * Method: start()
     */
    @Test
    public void testStart() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MainController.getClass().getMethod("start"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: errorDeal()
     */
    @Test
    public void testErrorDeal() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MainController.getClass().getMethod("errorDeal"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: userInputError(int type)
     */
    @Test
    public void testUserInputError() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MainController.getClass().getMethod("userInputError", int.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: userLoginView(int type, String name, String pwd, Boolean isExit)
     */
    @Test
    public void testUserLoginView() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MainController.getClass().getMethod("userLoginView", int.class, String.class, String.class, Boolean.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: userInputDealCenter(String input)
     */
    @Test
    public void testUserInputDealCenter() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MainController.getClass().getMethod("userInputDealCenter", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: toMainMenu()
     */
    @Test
    public void testToMainMenu() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MainController.getClass().getMethod("toMainMenu"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: toBookList()
     */
    @Test
    public void testToBookList() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MainController.getClass().getMethod("toBookList"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: toMovieList()
     */
    @Test
    public void testToMovieList() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MainController.getClass().getMethod("toMovieList"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: toMovieDetail(String input)
     */
    @Test
    public void testToMovieDetail() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MainController.getClass().getMethod("toMovieDetail", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: isStrToNum(String str)
     */
    @Test
    public void testIsStrToNum() throws Exception {
        //TODO: Test goes here...
        assertEquals(false, MainController.isStrToNum("ee"));
    }

    /**
     * Method: isExit(String string)
     */
    @Test
    public void testIsExit() throws Exception {
//TODO: Test goes here... 
/* 
try { 
   Method method = MainController.getClass().getMethod("isExit", String.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/
    }

    /**
     * Method: searchPwdByName(LinkedHashSet data)
     */
    @Test
    public void testSearchPwdByName() throws Exception {
        //TODO: Test goes here...
        assertEquals(true, MainController.isSearchPwdByName(UserInfoData.getNormalUser(), "lan", 1));
    }
}
