package com.robot.util;

import com.opensymphony.xwork2.ActionContext;

public class ActionUtil {
	public final static String REDIRECT = "redirect";
	public final static String AJAXSUCCESS="ajaxsuccess";
	public static void setUrl(String url) {
		ActionContext.getContext().put("url", url);
	}
}
