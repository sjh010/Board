package com.mobileleader.board.controller.freeBoard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.View;

import com.mobileleader.board.service.FreeBoardService;

@Controller
public class FreeBoardWriteController {
	
	@Autowired private View jsonView;
	@Autowired private FreeBoardService fbService;
}
