package com.sds.icto.mysite.action.guestbook;

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

		if ("guestbookform".equals(a)) {
			action = new GuestBookFormAction();
		} else if ("deleteForm".equals(a)) {
			action = new GuestBookDeleteFormAction();
		} else if ("delete".equals(a)) {
			action = new GuestBookDeleteAction();
		}else if ("insert".equals(a)) {
			action = new GuestBookInsertAction();
		}else if ("guestbook".equals(a)) {
			action = new GuestBookFormAction();
		}

		return action;
	}

}
