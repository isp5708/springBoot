package codeEditer.codeEditer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import codeEditer.codeEditer.dto.CodeEditerDto;
import codeEditer.codeEditer.service.CodeEditerService;

@Controller
public class CodeEditerController {
	@Autowired
	private CodeEditerService codeEditerService;
	
	@RequestMapping("/")
	public ModelAndView openCodeEditer() throws Exception{
		ModelAndView mv = new ModelAndView("AlgorithmSite/solutionSubmit");
		
		return mv;
	}
	
	@RequestMapping("/insertCode.do")
	public String insertCode(CodeEditerDto code) throws Exception{
		codeEditerService.insertCode(code);
		return "redirect:/";
	}
}
