package com.petifee.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.petifee.domain.SeatVO;

@Repository
public class SeatDAOImpl implements SeatDAO {
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.petifee.mapper.SeatMapper";
	
	@Override
	public void create(SeatVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
	}
	
	@Override
	public SeatVO read(int idx) throws Exception{
		return session.selectOne(namespace + ".read", idx);
	}
	
	@Override
	public void update(SeatVO vo) throws Exception {
		session.update(namespace + ".update", vo);
	}
	
	@Override
	public void delete(int idx) throws Exception {
		session.delete(namespace + ".delete", idx);
	}
	
	@Override
	public List<SeatVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}
}


