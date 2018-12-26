package demos.comm.service;

import demos.comm.dao.ReplyDAO;
import demos.comm.domain.Reply;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;
import java.util.List;

public class ReplyServiceImpl implements  ReplyService{

    @Autowired
    ReplyDAO replyDAO;

    @Override
    public void create(Reply reply) {
        replyDAO.create(reply);
    }

    @Override
    public List<Reply> list(Integer bno, int start, int end, HttpSession session) {
        return null;
    }

    @Override
    public Reply detail(int rno) {
        return replyDAO.detail(rno);
    }

    @Override
    public void update(Reply reply) {
        replyDAO.update(reply);
    }

    @Override
    public void delete(int rno) {
        replyDAO.delete(rno);
    }

    @Override
    public int count(int bno) {
        return replyDAO.count(bno);
    }
}
