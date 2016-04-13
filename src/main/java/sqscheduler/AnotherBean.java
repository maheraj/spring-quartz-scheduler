package sqscheduler;

import org.springframework.stereotype.Component;

/**
 * User: maheraj
 * Date: 4/13/16
 * Time: 1:56 PM
 */
@Component("anotherBean")
public class AnotherBean {

    public void printAnotherMessage() {
        System.out.println("I am called by Quartz jobBean using CronTriggerFactoryBean");
    }

}
