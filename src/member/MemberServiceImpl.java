package member;

import java.util.List;
import java.util.Map;

import bank.AccountService;
import bank.AccountServiceImpl;

public class MemberServiceImpl implements MemberService{
	
	MemberDAO dao = MemberDAO.getInstance();
	AccountService accService = AccountServiceImpl.getInstance();
	MemberBean session;
	private static MemberServiceImpl instance = new MemberServiceImpl();
	
	public static MemberServiceImpl getInstance() {
		return instance;
	}

	
	private MemberServiceImpl() {
		session = new MemberBean();
	}
	
	@Override
	public String regist(MemberBean mem) {
		String msg = "";
		MemberBean temp = this.findById(mem.getId());
		if (temp == null) {
			System.out.println(mem.getId()+"가 존재하지 않음,가입 가능한 ID");
			int result = dao.insert(mem);
			if (result==1) {
				msg = "success";
			} else {
				msg = "fail";
			}
		} else {
			System.out.println(mem.getId()+"가 존재함,가입 불가능한 ID");
			msg = "fail";
		}
		
		return msg;
	}


	@Override
	public void update(MemberBean mem) {
		int result = dao.update(mem);
		if (result == 1) {
			session = this.findById(mem.getId());
		} 
	}
	@Override
	public MemberBean show() {
		return session;
	}
	@Override
	public void delete(MemberBean member) {
		if (dao.delete(member) == 1) {
				session = null;
			}
		} 

	


	@Override
	public int count() {
		// TODO Auto-generated method stub
		return dao.count();
	}


	@Override
	public MemberBean findById(String findID) {
		return dao.findById(findID);
	}


	@Override
	public List<?> list() {
		
		return dao.list();
	}


	@Override
	public List<?> findBy(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Map<?, ?> map() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String login(MemberBean member) {
		// 2.로그인
		String result = "";
			if (dao.login(member)) {
				session = dao.findById(member.getId());
				result = session.getName();
				accService.map();
			}else{
				result = "fail";
			}
		System.out.println("서비스로그인결과?"+result);
		return result;
	}


	@Override
	public void logout(MemberBean member) {
		if (member.getId().equals(session.getId()) 
				&& member.getPw().equals(session.getPw())) {
			session = null;
		}
		
	}
}
