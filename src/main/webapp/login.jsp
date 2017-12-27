<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="./resources/js/jquery-3.2.1.js"></script>
<script language="javascript">
function checkUserName(obj) {  
         
        // 调用Ajax函数,向服务器端发送查询  
        $.ajax({ //一个Ajax过程  
            type: "post", //以post方式与后台沟通  
            url :"login/clogin", //与此页面沟通  
            dataType:'json',//返回的值以 JSON方式 解释  
            data: {'username':obj.value}, //发给的数据  
            success: function(json){//如果调用成功  
                if(json){  
                    showInfo("massage", "登录名可用");  
                }else {  
                    showInfo("massage", "登录名不存在");  
                    name_flag=true;  
                    change_submit();  
                    return;  
                }  
            }     
    });   
     
    name_flag=false;  
    change_submit();  
} 

/* 
 * 公用程序 
 */    
    function showInfo(target,Infos){    
    document.getElementById(target).innerHTML = Infos;    
    }    
    function showclass(target,Infos){    
    document.getElementById(target).className = Infos;    
    } 
</script>
    <title>login</title>
</head>
<body>
<form action="login/loginN" method="post" id="loginform">
    
  <table align="center">
  	<tr>
  		<td>登录名：</td>
  		<td><input type="text" name="username" onblur="checkUserName(this)"></td>
  		<td><p id="massage"></p></td>
  		 
  		 
  	</tr>
  	<tr>
  		<td>密码：</td>
  		<td> <input type="password" name="password"></td>
  	</tr>
  	<tr>
  		<td><input type="submit" value="提交"></td>
  		<td><a href="register.jsp">注册</a></td>
  	</tr>
  </table>  
    
    
</form>

</body>
</html>