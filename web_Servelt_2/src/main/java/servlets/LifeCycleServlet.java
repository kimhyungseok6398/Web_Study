package servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LifeCycleServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("GET 요청!!!");
    }

    @Override
    public void destroy() {
       System.out.println("destroy!");
    // 가장 마지막에 호출 ( 한번만 )
    // 자원 정리
    }

  /**  @Override
    public void init() throws ServletException {
       System.out.println("init!");
    // 가장 처음 호출 ( 한번만 )
    //
   **/
    @Override
    public void init(ServletConfig config) throws ServletException {
        String setting1 = config.getInitParameter("setting1");
        String setting2 = config.getInitParameter("setting2");
        System.out.printf("setting=%s,setting=%s%n",setting1, setting2);
    }
}
