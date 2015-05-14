package com.sds.icto.mysite.action.user;

import com.sds.icto.mysite.util.Action;

public class ActionFactory {
	private static ActionFactory instance;

	static {
		instance = new ActionFactory();
	}

	private ActionFactory() {

	}

	public static ActionFactory getInstance() {
		return instance;

	}

	public Action getAction(String a) {
		Action action = null;

		if ("join".equals(a)) {
			action = new InsertAction();
		}else if("loginform".equals(a)){
			action = new LoginFormAction();
		}else if("joinform".equals(a)){
			action = new JoinFormAction();
		}else if("logout".equals(a)){
			action = new LogOutFormAction();
		}else if("login".equals(a)){
			action = new LoginAction();
		}else if("idCheck".equals(a)){
			action = new GetMemberAction();
		}

		return action;
	}

}
