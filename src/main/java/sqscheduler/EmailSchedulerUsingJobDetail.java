package sqscheduler;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * User: maheraj
 * Date: 4/13/16
 * Time: 2:12 PM
 */
@Component("emailSchedulerUsingJobDetail")
public class EmailSchedulerUsingJobDetail extends QuartzJobBean {
    private MemberDao memberDao;

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Your Database cleanup completed for " + memberDao.getAll().size() + "!");
    }
}
