package codeEditer.codeEditer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import codeEditer.codeEditer.dto.CodeEditerDto;
import codeEditer.codeEditer.mapper.CodeEditerMapper;

@Service
public class CodeEditerServiceImpl  implements CodeEditerService {
	
	@Autowired
	private CodeEditerMapper codeEditerMapper;
	
	@Override
	public void insertCode(CodeEditerDto code)throws Exception{
		codeEditerMapper.insertCode(code);
	}
}
