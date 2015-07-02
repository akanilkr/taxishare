package com.share.ride.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GoogleAuthServlet
 */
@WebServlet("/auth")
public class GoogleAuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoogleAuthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<h1>This is GET</h1>");
		Enumeration<String> headers = request.getHeaderNames();
		while(headers.hasMoreElements()){
			String headerName = headers.nextElement();
			out.print(headerName+": "+request.getHeader(headerName));
			out.print("</br>");
		}
		
		Map<String, String[]> requestParamMap = request.getParameterMap();
		
		Set<String> requestParamMapKeys = requestParamMap.keySet();
		for (Iterator<String> iterator = requestParamMapKeys.iterator(); iterator
				.hasNext();) {
			String key = (String) iterator.next();
			String[] value = requestParamMap.get(key);
			out.print(key+": "+Arrays.asList(value));
			out.print("</br>");
		}
		
		out.print("<br/>");
		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<h1>This is POST</h1>");
		Enumeration<String> headers = request.getHeaderNames();
		while(headers.hasMoreElements()){
			String headerName = headers.nextElement();
			out.print(headerName+": "+request.getHeader(headerName));
			out.print("</br>");
		}
		
		Map<String, String[]> requestParamMap = request.getParameterMap();
		
		Set<String> requestParamMapKeys = requestParamMap.keySet();
		for (Iterator<String> iterator = requestParamMapKeys.iterator(); iterator
				.hasNext();) {
			String key = (String) iterator.next();
			String[] value = requestParamMap.get(key);
			out.print(key+": "+Arrays.asList(value));
			out.print("</br>");
		}
		
		out.print("<br/>");
		out.flush();
	}

}
