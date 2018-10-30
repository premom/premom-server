package com.petifee.service;

import java.util.List;

import com.petifee.domain.SeatVO;

public interface SeatService {
	//글 등록
	public void regist(SeatVO vo) throws Exception;
	//글 읽기
	public SeatVO read(int bno) throws Exception;
	//글 수정
	public void modify(SeatVO vo) throws Exception;
	//글삭제
	public void remove(int bno) throws Exception;
	//리스트 보기
	public List<SeatVO> listAll() throws Exception;
}
