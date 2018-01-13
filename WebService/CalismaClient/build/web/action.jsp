<%-- 
    Document   : action
    Created on : 26.Kas.2017, 18:03:33
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
</head>
<body>
   
    <%-- start web service invocation --%><hr/>
    <%
        String uname = request.getParameter("username");
        String veri = request.getParameter("select");
        if(veri.equals("instagram")){
            try {
	burak.NewWebService service = new burak.NewWebService();
	burak.CalismaWS port = service.getCalismaWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = uname;
	// TODO process result here
	java.lang.String result = port.getInsPic(name);
	request.setAttribute("result", result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
     }
     else if(veri.equals("twitter")){
           try {
	burak.NewWebService service = new burak.NewWebService();
	burak.CalismaWS port = service.getCalismaWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = uname;
	// TODO process result here
	java.lang.String result = port.getTwitPic(name);
	request.setAttribute("result", result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
     }    
    %>
    
    <img src="<%=request.getAttribute("result") %>"></img>
    
</body>
</html>
