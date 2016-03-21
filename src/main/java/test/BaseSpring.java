package test;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by burning on 2016/3/18.
 */
public class BaseSpring {
    public static ApplicationContext context;
    @Before
    public void startSpring(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
