package com.robot.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.junit.runner.Request;

import com.robot.model.SystemContext;

public class SystemContextFilter implements Filter {
	private int  pageSize;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		
		try {
			int tps=pageSize;
			try {
				tps=Integer.parseInt(req.getParameter("pageSize"));
			} catch (NumberFormatException e) {}
			int pageOffset = 0;
			try{
				pageOffset=Integer.parseInt(req.getParameter("pager.offset"));
			}catch (NumberFormatException e) {}
			SystemContext.setPageSize(pageSize);
			SystemContext.setPageOffset(pageOffset);
			chain.doFilter(req, resp);
		}finally{
			SystemContext.removePageOffset();
			SystemContext.removePageSize();
		}
		
	}

	@Override
	public void init(FilterConfig cfg) throws ServletException {
		// TODO Auto-generated method stub
		pageSize = Integer.parseInt(cfg.getInitParameter("pageSize"));
	}

}
