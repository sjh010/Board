package com.mobileleader.board.controller.freeBoard;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;

import com.mobileleader.board.dto.FreeBoard;
import com.mobileleader.board.service.FreeBoardService;

@Controller
public class FreeBoardController {
	
	@Autowired private View jsonView;
	@Autowired private FreeBoardService fbService;
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String freeBoardView(Model model){
		
		ArrayList<FreeBoard> fbList = fbService.getAll();
		return "freeBoardView";
	}
}
