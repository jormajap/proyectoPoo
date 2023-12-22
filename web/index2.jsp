<%-- 
    Document   : index
    Created on : 20 dic. 2023, 15:37:25
    Author     : DESIGN
--%>
<%
     String opc="";       
%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
    <table align='center'>
        <tr bgcolor='#E5E7E9'>
            <td ><B>SISTEMA</B></td>
        </tr>
        <tr >
            <td >&nbsp;</td>
        </tr>
    </table>
    <body>
        <jsp:include page="Vistas/menu.jsp?opc=0"/>
        <%
            opc = request.getParameter("opc");
            
            if (opc != null ) {
                if (opc.equals("a")) {
        %>
                    <jsp:include page="Vistas/registroBus.jsp" />
        <%
                }
                if (opc.equals("b")) {
        %>
                    <jsp:include page="Vistas/registroChofer.jsp" />
        <%
                }

                if(opc.equals("c")){
        %>
                    <jsp:include page="Vistas/itinerarioViaje.jsp" />
        <%        
            }
                                }
        %> 
    </body>
</html>
