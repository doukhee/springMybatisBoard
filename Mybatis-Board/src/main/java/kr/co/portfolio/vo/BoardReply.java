package kr.co.portfolio.vo;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardReply {

	private Long idx;
	private String retitle;
	private String recontent;
	private String writer;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	private Board board;
}
