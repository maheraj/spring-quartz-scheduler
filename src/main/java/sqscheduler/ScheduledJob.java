package sqscheduler;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * User: maheraj
 * Date: 4/13/16
 * Time: 2:01 PM
 */
public class ScheduledJob extends QuartzJobBean {


    private AnotherBean anotherBean;


    @Override
    protected void executeInternal(JobExecutionContext arg0)
            throws JobExecutionException {
        anotherBean.printAnotherMessage();
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
}