package co.home.prj.command;

import java.util.Scanner;

import co.home.prj.comm.Command;
import co.home.prj.comm.GB;
import co.home.prj.member.service.MemberSerVice;
import co.home.prj.member.service.MemberVO;
import co.home.prj.member.serviceImpl.MemberServiceImpl;

public class MemberSelect implements Command {
	private Scanner scn = new Scanner(System.in);

	@Override
	public void execute() {
		if (GB.AUTHOR.equals("ADMIN")) {
			MemberSerVice dao = new MemberServiceImpl();
//		MemberService dao = new MemberServiceImpl();
			MemberVO vo = new MemberVO();
			System.out.println("조회할 멤버를 입력");
			vo.setId(scn.nextLine());
			vo = dao.memberSelect(vo);
			System.out.println("id : " + vo.getId());
			System.out.println("이름 :  " + vo.getName());
			System.out.println("비밀번호 : " + vo.getPassword());
			System.out.println("전화번호 :" + vo.getTel());
			System.out.println("주소 : " + vo.getAddress());
			// TODO Auto-generated method stub

		} else {
			System.out.println("조회할 권한이 없습니다.");
		}
	}

}
