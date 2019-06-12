package iducs.springboot.board.utils;

import javax.servlet.http.HttpSession;

import iducs.springboot.board.domain.User;

public class HttpSessionUtils {
	public static boolean isEmpty(HttpSession session, String key) {
		Object object = session.getAttribute(key);
		if(object==null) {
			return true; //로그인 안된상태
		}
		return false; //로그인 된 상태
	}
	public static boolean isSameUser(User login, User writer) {
		if(login.equals(writer)) return true;
		return false;
	}
}
