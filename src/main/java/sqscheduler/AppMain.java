package sqscheduler;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: maheraj
 * Date: 4/13/16
 * Time: 1:57 PM
 */
public class AppMain {
    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("quartz-context.xml");
    }

}