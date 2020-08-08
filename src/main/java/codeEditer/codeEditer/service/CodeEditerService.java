package codeEditer.codeEditer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import codeEditer.codeEditer.dto.CodeEditerDto;
import codeEditer.codeEditer.mapper.CodeEditerMapper;

public interface CodeEditerService {	
	void insertCode(CodeEditerDto code)throws Exception;
}
