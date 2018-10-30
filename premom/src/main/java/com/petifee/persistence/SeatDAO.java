package com.petifee.persistence;

import java.util.List;

import com.petifee.domain.SeatVO;

public interface SeatDAO {
	//글 작성하기
		public void create(SeatVO vo) throws Exception;
		//글 읽어오기
		public SeatVO read(int bno) throws Exception;
		//글 수정하기
		public void update(SeatVO vo) throws Exception;
		//글 삭제하기
		public void delete(int bno) throws Exception;
		//글 목록 가져오기
		public List<SeatVO> listAll() throws Exception;
}
