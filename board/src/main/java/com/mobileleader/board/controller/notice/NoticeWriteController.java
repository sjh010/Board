package com.mobileleader.board.controller.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.View;

import com.mobileleader.board.service.NoticeService;

@Controller
public class NoticeWriteController {
	
	@Autowired private View jsonView;
	@Autowired private NoticeService nService;
}
