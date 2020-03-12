package kr.co.portfolio.vo;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberRole {

	private Long idx;
	private String role;
	
	private Timestamp createdAt;
	private Timestamp updatedAt;
}
