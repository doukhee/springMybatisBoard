package kr.co.portfolio.vo;

import java.sql.Timestamp;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

	private Long idx;
	private String userEmail;
	private String userName;
	private String userPassword;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	private List<MemberRole> roles;
}
