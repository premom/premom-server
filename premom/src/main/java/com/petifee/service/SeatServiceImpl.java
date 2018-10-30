package com.petifee.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.petifee.domain.SeatVO;
import com.petifee.persistence.SeatDAO;

@Service
public class SeatServiceImpl implements SeatService {
	
	@Inject
	private SeatDAO dao;
	
	@Override
	public void regist(SeatVO vo) throws Exception {
		dao.create(vo);
	}
	
	@Override
	public SeatVO read(int idx) throws Exception {
		return dao.read(idx);
	}
	
	@Override
	public void modify(SeatVO vo) throws Exception {
		dao.update(vo);
	}
	
	@Override
	public void remove(int idx) throws Exception {
		dao.delete(idx);
	}
	
	@Override
	public List<SeatVO> listAll() throws Exception {
		return dao.listAll();
	}
}

