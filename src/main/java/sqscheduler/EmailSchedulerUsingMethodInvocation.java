package sqscheduler;

import org.springframework.stereotype.Component;

/**
 * User: maheraj
 * Date: 4/13/16
 * Time: 2:12 PM
 */
@Component("emailSchedulerUsingMethodInvocation")
public class EmailSchedulerUsingMethodInvocation {
    public void sendGeneralGreetings() {
        System.out.println("Thank you all for being with us and for being patient!");
    }
}
