<%-- 
    Document   : loginForm
    Created on : Jan 2, 2014, 9:44:08 PM
    Author     : Rishitha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      
        <script src="jquery-1.8.0.min.js"></script>
        <script>
            
            $(document).ready(function(){
                $("#submit").click(function(){
                     var uname = $("#uname").val();
                     var password = $("#password").val();
                     if(uname == null || password == null ){
                         alert("Username/Password is missing ");
                         return false;
                     }else{
                         document.forms.form[0].submit();
                     }
                    
                });
            }); 
            
        </script>
        <script type="text/javascript" language="javascript">// <![CDATA[
function checkAll()
{
  var checkboxes = new Array();
  checkboxes = document.getElementsByTagName('input');
  alert(checkboxes);
  for (var i=0; i<checkboxes.length; i++)  {
    if (checkboxes[i].type == 'checkbox')   {
      checkboxes[i].checked = true;
    }
  }
}
</script>
        
    </head>
    <body>
        
        <form name="checkform" action="login.spring">
            
            <table>
                
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="uname" id="uname"/>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" id="password" name="password"/>
                </tr>
                <tr>
                    <td colspan="1"><input type="submit" id="submit"/></td>
                </tr>
                
                
                
            </table>
            
            
            
            
        </form>
        
        
        
        
    </body>
</html>
