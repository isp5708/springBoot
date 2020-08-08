package codeEditer.codeEditer.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import codeEditer.codeEditer.dto.CodeEditerDto;

@Mapper
public interface CodeEditerMapper {
	void insertCode(CodeEditerDto code) throws Exception;
}
