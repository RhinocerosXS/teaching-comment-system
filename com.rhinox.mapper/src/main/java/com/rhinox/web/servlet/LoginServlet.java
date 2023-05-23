package com.rhinox.web.servlet;

import com.alibaba.fastjson.JSON;
import com.mysql.cj.Session;
import com.rhinox.pojo.User;
import com.rhinox.service.UserService;
import com.rhinox.util.SqlSessionFactoryUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private UserService service = new UserService();
    SqlSessionFactoryUtils sqlSessionFactoryUtils = new SqlSessionFactoryUtils();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置传值的编码
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
/*

        //数据流获取信息
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = request.getReader();
        char[] buf = new char[1024];
        int len;
        while ((len = reader.read(buf)) != -1) {
            sb.append(buf, 0, len);
        }

        //转json
        String str = sb.toString();
        JSONObject jsonObject = JSONObject.parseObject(str);


        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
*/
/*
        //获取前端传入数据中的用户名和密码，到数据库中进行查询
        // User user = mapper.select(jsonObject.getString("Number"), jsonObject.getString("password"));
        JSONObject jsonObject1 = new JSONObject();
        User user = mapper.select(jsonObject.getString("Number"), jsonObject.getString("password"));
        if (user != null) {
            jsonObject1.put("State", 1);
        } else {
            jsonObject1.put("State", 0);
            jsonObject1.put("Text", "账号或密码错误!");
            request.getRequestDispatcher("/login3.html").forward(request, response);
        }
        response.getWriter().write(String.valueOf(jsonObject1));
        sqlSession.close();

        String username = request.getParameter("Number");
        String password = request.getParameter("password");

        //2. 调用service查询
        User user1 = service.login(username, password);
        //3. 判断
        if (user1 == null) {
            // 存储错误信息到request
            request.setAttribute("msg", "用户名或密码错误");

            // 跳转到login
            request.getRequestDispatcher("/login3.html").forward(request, response);
        }else {

        }*/
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = service.login(username, password);
        PrintWriter writer = response.getWriter();

        String json="";
        if (user!=null){
            //登录成功
        }else{

        }
        writer.print(json);
        // 刷新，用于大文件
        writer.flush();
        if(user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            Cookie c_username = new Cookie("username",username);
            Cookie c_password = new Cookie("password",password);
            // 设置Cookie的存活时间
            c_username.setMaxAge( 60 * 60 * 24 * 7);
            c_password.setMaxAge( 60 * 60 * 24 * 7);
            //2. 发送
            response.addCookie(c_username);
            response.addCookie(c_password);
        }else {

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}