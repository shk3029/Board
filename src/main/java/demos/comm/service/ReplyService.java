package demos.comm.service;

import demos.comm.domain.Reply;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface ReplyService {
    // 1. 댓글입력
    public void create(Reply reply);

    // 2. 댓글목록
    public List<Reply> list(Integer bno, int start, int end, HttpSession session);

    // 3. 댓글 상세보기
    public Reply detail(int rno);

    // 4. 댓글 수정
    public void update(Reply reply);

    // 5. 댓글 삭제
    public void delete(int rno);

    // 6. 댓글 갯수
    public int count(int bno);
}
