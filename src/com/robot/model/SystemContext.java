package com.robot.model;

public class SystemContext {
	
	private static ThreadLocal<Integer> pageOffset = new ThreadLocal<Integer>();
	private static ThreadLocal<Integer> pageSize = new ThreadLocal<Integer>();
	private static ThreadLocal<UserInfo> loginUser = new ThreadLocal<UserInfo>();
	private static ThreadLocal<String> realPath = new ThreadLocal<String>();
	

	public static String getRealPath() {
		return realPath.get();
	}
	public static void setRealPath(String _realPath) {
		realPath.set(_realPath);
	}
	public static void removeRealPath() {
		realPath.remove();
	}
	public static UserInfo getLoginUser() {
		return loginUser.get();
	}
	public static void setLoginUser(UserInfo _loginUser) {
		loginUser.set(_loginUser);
	}
	public static void removeLoginUser() {
		loginUser.remove();
	}
	public static int getPageOffset() {
		return pageOffset.get();
	}
	public static void setPageOffset(int _pageOffset) {
		pageOffset.set(_pageOffset);
	}
	public static int getPageSize() {
		return pageSize.get();
	}
	public static void setPageSize(int _pageSize) {
		pageSize.set(_pageSize);
	}
	
	public static void removePageOffset() {
		pageOffset.remove();
	}
	
	public static void removePageSize() {
		pageSize.remove();
	}
	
	
}
