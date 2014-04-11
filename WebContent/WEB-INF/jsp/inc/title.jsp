<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


   <div class="navbar">
        <div class="navbar-inner">
                        <ul class="nav pull-right">
                    
                      <li id="fat-menu" class="dropdown">
                        <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user"></i> ${sessionScope.loginUser.userName }
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="user_info.action">我的账号</a></li>
                            <li class="divider"></li>
                            <li class="divider visible-phone"></li>
                            <li><a tabindex="-1" href="login.jsp">退出系统</a></li>
                        </ul>
                    </li>
                    
                </ul>    
                <a class="brand" href="index.html"><span class="first">测量</span> <span class="second">机器人</span></a>
        </div>
    </div>
    
  