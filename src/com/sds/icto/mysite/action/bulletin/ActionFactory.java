package com.sds.icto.mysite.action.bulletin;

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
		if("bulletinWriteForm".equals(a)){
			action = new BulletinWriteFormAction();
		}else if("insert".equals(a)){
			action = new BulletinWriteAction();
		}else if("bulletinMain".equals(a)){
			action = new BulletinFormAction();
		}else if("bulletinDetail".equals(a)){
			action = new BulletinDetailAction();
		}else if("goToUpdateForm".equals(a)){
			action = new BulletinUpdateFormAction();
		}else if("updateBulletin".equals(a)){
			action = new BulletinUpdateAction();
		}else if("bulletinDelete".equals(a)){
			action = new BulletinDeleteAction();
		}
		
		return action;
	}

}
