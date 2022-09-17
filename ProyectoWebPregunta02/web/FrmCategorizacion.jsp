<%-- 
   
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script>
              function   Calcular()
              {
                  document.form.action="<%=request.getContextPath()%>/CategoriaControlador"; // destino  hacia  otra  pagina 
                  document.form.method="GET"; //  tipo redireccionamiento 
                  document.form.submit(); // es  un metodo para enviar los  parametros
              }
        </script>   
        
        
    </head>
    <body>
        
       <center>
        <form name="form">
            <table style="width: 400px;height: 100px ;background-color: yellow">
                <tr>
                    <td>Categoria :</td>
                    <td><select name="txtCategoria" >
                            <option value="0" selected="">..............</option>
                            <option value="A">A</option>
                            <option value="B">B</option>
                            <option value="C">C</option>
                            <option value="D">D</option>
                           
                            
                        </select></td>
                </tr>  
                <tr>
                    <td>Tipo de Alumno :</td>
                   
                    
                     <td><select name="txtTipoAlumno" >
                            <option value="0" selected="">..............</option>
                            <option value="INTERNO">INTERNO</option>
                            <option value="EXTERNO">EXTERNO</option>
                           
                            
                        </select></td>
                    
                    
                </tr> 
                
             
                 <tr>
                    <td>Promedio :</td>
                    <td><input type="text"  name="txtPromedio" /></td>
                </tr> 
                
                <tr >
                    <td  colspan="2">
                          <center>
                              <input type="button" name="bntCalcular" value="Calcular"  onclick="Calcular()"/>
                          </center>                     
                    </td>
                </tr>
                
                  <tr>
                    <td>pension final :</td>
                    <td><input type="text"  name="txtPensionFINAL"    <%     // fraccion de codigo java
              if(request.getAttribute("pensionFINAL")!=null)// capturo el parametro de nombre mensaje
              { %>
               
                value="<%=(String)request.getAttribute("pensionFINAL")%>" 
              <%}            
            %>   /></td>
                </tr> 
                
                
            </table>
        </form>
    </center>
    </body>
</html>
