/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-05-09 12:48:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Sliding Form</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- partial:index.partial.html -->\r\n");
      out.write("<script src=\"static/js/jquery-3.1.1.min.js\" integrity=\"sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"static/js/jquery-ui.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"static/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\r\n");
      out.write("<div class=\"body\">\r\n");
      out.write("    <div class=\"veen\">\r\n");
      out.write("        <div class=\"login-btn splits\">\r\n");
      out.write("            <p>已有账号?</p>\r\n");
      out.write("            <button class=\"active\">登录</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"rgstr-btn splits\">\r\n");
      out.write("            <p>没有账号?</p>\r\n");
      out.write("            <button>注册</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <form id=\"login\" tabindex=\"500\">\r\n");
      out.write("                <h3>登录</h3>\r\n");
      out.write("                <div class=\"mail\">\r\n");
      out.write("                    <input type=\"mail\" id=\"username\">\r\n");
      out.write("                    <label>邮箱或用户名</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"passwd\">\r\n");
      out.write("                    <input type=\"password\" id=\"password\">\r\n");
      out.write("                    <label>密码</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"submit\">\r\n");
      out.write("                    <button class=\"dark\" name=\"login_btn\">登录</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <form id=\"register\" tabindex=\"502\">\r\n");
      out.write("                <h3>注册</h3>\r\n");
      out.write("                <div class=\"name\">\r\n");
      out.write("                    <input type=\"text\" name=\"reg_name\">\r\n");
      out.write("                    <label>用户名</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"mail\">\r\n");
      out.write("                    <input type=\"mail\" name=\"reg_mail\">\r\n");
      out.write("                    <label>邮箱</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"uid\">\r\n");
      out.write("                    <input type=\"text\" name=\"reg_passwd\">\r\n");
      out.write("                    <label>密码</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"passwd\">\r\n");
      out.write("                    <input type=\"password\" name=\"reg_repasswd\">\r\n");
      out.write("                    <label>重复密码</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"submit\">\r\n");
      out.write("                    <button class=\"dark\" name=\"reg_btn\">注册</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("    .site-link{\r\n");
      out.write("        padding: 5px 15px;\r\n");
      out.write("        position: fixed;\r\n");
      out.write("        z-index: 99999;\r\n");
      out.write("        background: #fff;\r\n");
      out.write("        box-shadow: 0 0 4px rgba(0,0,0,.14), 0 4px 8px rgba(0,0,0,.28);\r\n");
      out.write("        right: 30px;\r\n");
      out.write("        bottom: 30px;\r\n");
      out.write("        border-radius: 10px;\r\n");
      out.write("    }\r\n");
      out.write("    .site-link img{\r\n");
      out.write("        width: 30px;\r\n");
      out.write("        height: 30px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<!-- partial -->\r\n");
      out.write("<script src=\"static/js/script.js\"></script>\r\n");
      out.write("<script src=\"static/js/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    //用户登录\r\n");
      out.write("    const login_btn = document.getElementsByName(\"login_btn\")\r\n");
      out.write("    const reg_btn = document.getElementsByName(\"reg_btn\")\r\n");
      out.write("    login_btn.onclick = function ulogin(){\r\n");
      out.write("        //获取用户名和密码,登录成功以后，把用户名存储在session里面，然后显示在首页里面\r\n");
      out.write("        var username=$(\"#username\").val();\r\n");
      out.write("        var password=$(\"#password\").val();\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            method : 'post',\r\n");
      out.write("            url : \"http://localhost:8080/brand-case/loginServlet\",\r\n");
      out.write("            dataType : \"text\",\r\n");
      out.write("            data : {\r\n");
      out.write("                username : username,\r\n");
      out.write("                password : password\r\n");
      out.write("            },\r\n");
      out.write("            success : function() {\r\n");
      out.write("                    $(\"#close_lo\").click();\r\n");
      out.write("                    // 把用户名密码存储在session里面，首页显示用户名称\r\n");
      out.write("                    localStorage.setItem(\"username\",username);\r\n");
      out.write("                    load_data();\r\n");
      out.write("            },\r\n");
      out.write("            error : function () {\r\n");
      out.write("                alert(\"用户名或者密码输入错误，请重新输入\");\r\n");
      out.write("                $(\"#password\").val('');\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("    reg_btn.onclick = function register(){\r\n");
      out.write("        //获取用户名和密码,登录成功以后，把用户名存储在session里面，然后显示在首页里面\r\n");
      out.write("        var reg_username=$(\"#reg_name\").val();\r\n");
      out.write("        var reg_password=$(\"#reg_passwd\").val();\r\n");
      out.write("        var reg_mail=$(\"#reg_mail\").val();\r\n");
      out.write("        var reg_repassword=$(\"#reg_repasswd\").val();\r\n");
      out.write("        if(reg_password !== reg_repassword) {\r\n");
      out.write("            alert(\"两次输入密码不同!\");\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            method : 'get',\r\n");
      out.write("            url : \"http://localhost:8080/brand-case/registerServlet?username=\"+reg_username,\r\n");
      out.write("            dataType : \"text\",\r\n");
      out.write("            data : {\r\n");
      out.write("                username : reg_username,\r\n");
      out.write("                password : reg_password,\r\n");
      out.write("                re_password : reg_repassword,\r\n");
      out.write("                mail : reg_mail\r\n");
      out.write("            },\r\n");
      out.write("            success : function() {\r\n");
      out.write("                $(\"#close_lo\").click();\r\n");
      out.write("                // 把用户名密码存储在session里面，首页显示用户名称\r\n");
      out.write("                localStorage.setItem(\"username\",reg_username);\r\n");
      out.write("                load_data();\r\n");
      out.write("            },\r\n");
      out.write("            error : function () {\r\n");
      out.write("                alert(\"该用户名已存在\");\r\n");
      out.write("                $(\"#reg_name\").val('');\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("    }\r\n");
      out.write("    function load_data(){\r\n");
      out.write("        var theme=localStorage.getItem(\"username\");\r\n");
      out.write("        if(theme==null||theme==\"\"){\r\n");
      out.write("            $(\"#cue\").show();\r\n");
      out.write("            $(\"#uname\").html('');\r\n");
      out.write("        }else{\r\n");
      out.write("            $(\"#cue\").hide();\r\n");
      out.write("            $(\"#uname\").html(theme);\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
