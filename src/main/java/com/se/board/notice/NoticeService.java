package com.se.board.notice;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.se.board.BoardDTO;
import com.se.board.BoardService;
import com.se.util.Paper;
@Service
public class NoticeService implements BoardService {
	
	@Inject
	private NoticeDAO noticeDAO;

	@Override
	public List<BoardDTO> list(Paper pager) throws Exception {
	pager.makeRow();
	int totalCount = noticeDAO.totalCount(pager);
	pager.makePage(totalCount);
		return noticeDAO.list(pager);				//원래는 model 뷰를 만들고 리턴한다.
	}

	@Override
	public BoardDTO select(int num) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.select(num);
	}

	@Override
	public int insert(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.insert(boardDTO);
	}

	@Override
	public int update(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.update(boardDTO);
	}

	@Override
	public int delete(int num) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.delete(num);
	}

}
