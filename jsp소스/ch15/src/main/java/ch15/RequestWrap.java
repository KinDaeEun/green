package ch15;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class RequestWrap extends HttpServletRequestWrapper {
	private HttpServletRequest request;
	
	public RequestWrap(HttpServletRequest request) {
		super(request);
		this.request = request;
	}

	public String getParameter(String name) {
		String value = request.getParameter(name);
		return value+"에이 바보";
	}
	
	public String[] getParameterValues(String name) {
		String[] values = request.getParameterValues(name);
		if(values==null||values.length==0) {
			return null;
		}
		String[] newVal = new String[values.length];
		for(int i=0;i<values.length;i++) {
			newVal[i] = values[i]+"맛있어 개꿀";
		}
		return newVal;
	}
	
}
