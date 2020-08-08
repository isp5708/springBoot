package codeEditer.codeEditer.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CodeEditerDto {
	private int code_idx;
	private String code_contents;
}
