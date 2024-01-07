package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

// 요청과 응답 사이 메서드
@WebServlet("/join") // xml에 주석 설정후 어노테이션
public class JoinServlet extends HttpServlet {  // 이로인해 서블릿 사용가능


    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;=UTF-8");   // 이렇게 형식을 알려줘야 브라우저가 출력/ 아래 메서드를 한줄로 합칠 수 있음 ( 헤더 )
        // resp.setCharacterEncoding("UTF-8"); // ( 헤더 )
        PrintWriter out = resp.getWriter(); // 한글을 깨지지 않게 하기 위해 ( 바디 )
        //out.print("<h1> 안녕하세요!</h1>");  // 한글 깨짐 ( 바디 )

        /**
         * 회원가입 양식
         * 옛날버전은 한글이 깨질 수 있기에 위 메서드처럼 알려줘야한다
         */
        out.print("<form method='post' action='join'>");
        out.print("아이디 : <input type='text' name='userId'><br>");
        out.print("비밀번호 : <input type='password' name='password'><br>");
        out.print("회원명 : <input type='text' name='userNm'><br>");
        out.print("취미 : <input type='checkbox' name='hobby' value='취미1'>취미");
        out.print("<input type='checkbox' name='hobby' value='취미2'>취미2");
        out.print("<input type='checkbox' name='hobby' value='취미3'>취미3<br>");
        out.print("<button type='submit'>가입하기</button>");
        out.print("<form>");

        System.out.println("doGet!!");
        // 개발 할 경우 웹 페이지가 100이상이 넘어가기 때문에
        // 위 방식을 개발을 하기엔 버겁다
        // 그렇기 때문에 JSP
        // JSP : 번역기술 ( 서블릿 코드를 번역해주는 것)
    }

    /**
     * 하단은 아주 중요한 메서드들
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String userId = req.getParameter("userId");
       String password = req.getParameter("password");
       String userNm = req.getParameter("userNm");
       // String hobby = req.getParameter("hobby"); // 브라우저에는 취미가 3개 모두 나오지만 출력은 하나만나온다.
        String[] hobbies = req.getParameterValues("hobby"); // 여러개 항목을 조회


        System.out.printf("userId=%s, password=%s,userNm=%s%n", userId, password, userNm);
        System.out.println(Arrays.toString(hobbies));
    }
}
