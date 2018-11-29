package com.javalec.guestbook.action;

import com.javalec.guestbook.web.Action;
import com.javalec.guestbook.web.ActionFactory;

public class GuestBookFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		// TODO Auto-generated method stub
		
		Action action = null;
		
		if("add".equals(actionName)) {
			action = new WriteAction();
		} else if ("addform".equals(actionName)) {
			action = new WriteFormAction();
		} else if ("delete".equals(actionName)) {
			action = new DeleteAction();
		} else if ("deleteform".equals(actionName)) {
			action = new DeleteFormAction();
		} else if ("update".equals(actionName)) {
			action = new UpdateAction();
		} else if ("updateform".equals(actionName)) {
			action = new UpdateFormAction();
		} else if ("updatecon".equals(actionName)) {
			action = new UpdateConAction();
		}else if ("login".equals(actionName)) {
			action = new LogInAction();
		} else if ("logout".equals(actionName)) {
			action = new LogOutAction();
		} else {
			action = new ListAction();
			
		}
				
		
		return action;
	}

}
