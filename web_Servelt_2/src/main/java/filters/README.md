# 필터와 래퍼 (07_19_12)

* * * 

## 필터란?
* 요청과 응답 사이에서 걸러주는 기능


## 필터클래스, 필터 객체, 필터
* Filter 인터페이스를 구현 -> 필터 클래스


## 필터가 위치하는 곳


## 필터 클래스의 작성, 설치 등록
* web.xml

        <filter>
        <filter-name>_</filter-name>
        <filter-class>_</filter-class>
        </filter>
        <filter-mapping>
        <url-pattern>_</url-pattern>
        </filter-mapping>


* HttpServletRequest의 편의 구현 클래스 HttpServletRequestWrapper 
* HttpServletResponse 편의 구현 클래스 HttpServletResponseWrapper



## JSP

* * * 

## JSP특징
* 서블릿 코드 번역기술



## JSP의 페이지 처리과정
* hello.jsp -> 번역 -> hello_jsp.java -> hello_jsp,class ->
* 