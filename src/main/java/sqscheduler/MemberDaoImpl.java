package sqscheduler;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * User: maheraj
 * Date: 4/13/16
 * Time: 2:40 PM
 */
@Component("memberDao")
public class MemberDaoImpl implements MemberDao {
    @Override
    public List<Member> getAll() {
        List<Member> members = new ArrayList<Member>();
        for (long i = 0; i <= 10; i++) {
            Member member = new Member();
            member.setId(i + 1);
            member.setName("member " + member.getId());
            members.add(member);
        }
        return members;
    }
}
