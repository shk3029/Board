package demos.comm.dao;

import demos.comm.domain.Reply;

import java.util.List;

public interface ReplyDAO {
    public void create(Reply reply);
    public List<Reply> list(int bno, int start, int end);
    public Reply detail(int rno);
    public void update(Reply reply);
    public void delete(int rno);
    public int count(int bno);
}
