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
		
		int result = dao.insert(mem);
		if (result==1) {
			msg = "회원가입 축하합니다";
		} else {
			msg = "회원가입 실패";
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
				result = "";
			}
		
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
