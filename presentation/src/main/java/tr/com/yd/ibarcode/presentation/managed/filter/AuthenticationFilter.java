package tr.com.yd.ibarcode.presentation.managed.filter;


import javax.faces.application.ResourceHandler;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tr.com.yd.ibarcode.presentation.managed.session.SessionUser;

import java.io.IOException;

@WebFilter("/*")
public class AuthenticationFilter implements Filter{

    static final String LOGIN_PAGE = "/login/login.xhtml";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        String loginURL = httpServletRequest.getContextPath() + LOGIN_PAGE;
        boolean resourceRequest = httpServletRequest.getRequestURI().startsWith(httpServletRequest.getContextPath() + ResourceHandler.RESOURCE_IDENTIFIER);
        boolean loginRequest = httpServletRequest.getRequestURI().equals(loginURL);
        if (resourceRequest || loginRequest) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        SessionUser sessionUser = (SessionUser) httpServletRequest.getSession().getAttribute("sessionUser");
        if (sessionUser != null) {
            if (sessionUser.getKullanici() != null) {
                // user is logged in, continue request
                filterChain.doFilter(servletRequest, servletResponse);
            } else {
                // user is not logged in, redirect to login page
                httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + LOGIN_PAGE);
            }
        } else {
            // user is not logged in, redirect to login page
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + LOGIN_PAGE);
        }
    }

    @Override
    public void destroy() {

    }

}
