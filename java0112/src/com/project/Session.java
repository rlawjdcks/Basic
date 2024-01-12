package com.project;

public class Session {
	private boolean run;
	private boolean run2;
	private LoginInfo loginInfo;
	
	//enum은 바로 이름으로 가져오면 된다 static가져오듯이 
	//private MenuState menuState = MenuState.TOP; 에서 
	//MenuState1 menuState 이걸로 바로 가져와서 사용하면 된다
	//enum이름은 클래스처럼 같아야한다 
	
	private MenuState1 menuState = MenuState1.TOP;
	
	
	public MenuState1 getMenuState() {
		return menuState;
	}
	
	public void setMenuState(MenuState1 menuState) {
		if (menuState == MenuState1.DEPOSIT) {
			run2 = true;
		} else if(menuState ==MenuState1.TOP_EXIT){
			run = false;
		} else if (menuState == MenuState1.DEPOSIT_EXIT) {
			run2 = false;
		}
		
		this.menuState = menuState;
	}
	
	
	
	public LoginInfo getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(LoginInfo loginInfo) {
		this.loginInfo = loginInfo;
	}

	
	

	public Session(boolean run, boolean run2) {
		super();
		this.run = run;
		this.run2 = run2;
	}

	public Session(boolean run, boolean run2, LoginInfo loginInfo) {
		super();
		this.run = run;
		this.run2 = run2;
		this.loginInfo = loginInfo;
	}

	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

	public boolean isRun2() {
		return run2;
	}

	public void setRun2(boolean run2) {
		this.run2 = run2;
	}
}
