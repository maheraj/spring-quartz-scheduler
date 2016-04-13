package sqscheduler;

import org.springframework.stereotype.Component;

/**
 * User: maheraj
 * Date: 4/13/16
 * Time: 1:54 PM
 */
@Component("myBean")
public class MyBean {
    public void printMessage() {
        System.out.println("I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
    }
}
