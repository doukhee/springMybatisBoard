package kr.co.portfolio.vo;

import java.sql.Timestamp;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {

	private Long idx;
	private String title;
	private String content;
	private String writer;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	private List<BoardReply> replies;
}
