package com.mobileleader.board.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileleader.board.dto.FreeBoard;

@Service
public class FreeBoardService {

	@Autowired private SqlSession sqlsession;
	
	public ArrayList<FreeBoard> getAll() {
		FreeBoardDao fbDao = sqlsession.getMapper(FreeBoardDao.class);
		ArrayList<FreeBoard> fbList = fbDao.getAll(); 
		return fbList;
	}

}
