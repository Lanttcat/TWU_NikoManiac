package test.main.view; 

import main.view.Components;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* Components Tester. 
* 
* @author <Authors name> 
* @since <pre>07/18/2018</pre> 
* @version 1.0 
*/ 
public class ComponentsTest { 

@Before
public void before() throws Exception {
    System.out.println("starting test");
}

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: drawFrameTitle(String windowTitle) 
* 
*/ 
@Test
public void testDrawFrameTitle() throws Exception { 
//TODO: Test goes here...
    assertEquals("**********\n**  ss  **\n**********\n",
                    new Components(10).drawFrameTitle("ss"));

} 

/** 
* 
* Method: drawBaseText() 
* 
*/ 
@Test
public void testDrawBaseText() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: drawFrameMainContent() 
* 
*/ 
@Test
public void testDrawFrameMainContent() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: listComponent() 
* 
*/ 
@Test
public void testListComponent() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: runDrawFrame() 
* 
*/ 
@Test
public void testRunDrawFrame() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: batchChar(char printChar, int width) 
* 
*/ 
@Test
public void testBatchChar() throws Exception { 
//TODO: Test goes here... 
    assertEquals("****", new Components(4).batchChar('*', 4));
}

/** 
* 
* Method: centerString(String text, int width, String sideStr) 
* 
*/ 
@Test
public void testCenterString() throws Exception { 
//TODO: Test goes here...
    assertEquals("**  aa  **", new Components(10).centerString("aa", 10, "**"));
}

} 
