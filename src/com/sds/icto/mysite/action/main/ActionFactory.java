package com.sds.icto.mysite.action.main;

import com.sds.icto.mysite.action.user.InsertAction;
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
		Action action = new IndexAction();

		return action;
	}

}
