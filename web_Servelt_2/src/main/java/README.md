* 요청과 응답 이해



## 요청(request) : 브라우저(클라이언트)
## 응답(response) : 서버(server)


## 참고)
* server
* https:// : 프로토콜 : 웹페이지를 전송하고 응답하는 규칙



## 요청전문
## 헤더(Header)
* 요청 (URL)
* 요청방식(method) : GET, POST
* 요청 정보(언어, 브라우저 종류 등등)
* 쿠키...
* 요청 IP



## 바디(Body)
* 요청 전송 데이터(POST...)



## 응답전문
## 헤더(Header)
* 응답 바디 데이터에 대한 종류
* content-type: text/html;
* application/json;
* 서버 종류
* 브라우저가 할 행동에 대한 명령
* location: 주소 -> 브라우저가 주소 이동
* Set-cookie : 키=값; 키=값;
* Refresh : 초 : 새로고침


## 응답 상태코드
## 2xx : 정상 응답(요청 -> 서버 -> 응답)
* 201 : 작성됨(CREATED)
* 202 : ACCEPT



## 3xx
* 301 : 영구이동
* 302 : 임시이동 : 페이지 이동
* 304 : 케시됨 / 캐시 - 임시 저장 메모리



## 4xx : 클라이언트 오류
* 400(Bad Request - 잘못된 요청)
* 401(UnAuthorized) - 접근 권한 없음(관리자 페이지등)
* 403(Forbidden) - 금지됨(권한없음)
* 404(Not Found) - 페이지 없음(잘못된 주소입력)
* 405(Method Not Allowed) : 메서드 등록이 안됨




## 5xx
* 500 (Internal Server Error) : 코드의 오류
* 501
* 503 (Service Unavaiable) : 서비스를 사용할 수 없음
## 바디(Body)
* 응답 출력 데이터

## 브라우저에 개발자모드에서 캐시사용중지를 하게되면 200코드만 나온다
* 매번 서버에 도달해서 자원을 가져온다


## HTTP (HyperText Transfer Protocol)
* HTML



## FTP(파일전송프로토콜)



## HTTP 요청 메서드
## GET
* 질의, 쿼리 스트링
* 자원에 조회가 큰 목적
* 요청헤더 O, 요청 Body x




## POST
* 작성(서버에 기록)
* 요청 헤더 : contect=type:application/x-www-form-urlencoded; // 일반 기본 양식 형식
* applocation/json;
* 요청데이터 : 바디
* 참고)
* content-type-application/json; (이름: 값. 이름: 값)

## 참고(POTS 방식의 일종)
## PUT
* 데이터 전체 치환

## PATCH
* 데이터 부분 치환


## OPTIONS
* 요청을 하기전에 통신 옵션을 설명하는

## DELETE



# 서블릿

* * * 

## 서블릿의 개요
* 자바의 웹기술
* jakarta ee
* Servlet-api (API : Application Programing Interface)
* (jakarta.servlet 메이븐 의존성 : jakarta.servlet-api, 6.0.0)
* 스프링은 기본적으로 6.0.0 을 내장하고 있음

## 서블릿 클래스 작성하기
* HttpServlet 추상 클래스를 상속 -> 서블릿 클래스



## 인터페이스(중요)
## HttpServletRequest
* 요청과 관련된 기능, 정보 객체
## HttpServletResponse
* 응답과 관련된 기능, 정보 객체

## 웹서버는 멀티 쓰레드 방식으로 동작 / 서블릿 객체를 공유 / 인스턴스 변수는 동시성 문제 발생 가능성, 사용을 지양
* httpServlet h, HttpServletResponse r
* 요청과 응답



## web.xml 파일에서 서블릿 등록하기 
* 배치 설명자 파일
  * webapp/WEB-INF/web.xml

          <web-app>

          <servlet>
          <servlet-name></servlet-name>
          <servlet-class></servlet-class>
          <init-param>
          <param-name>설정명</param-name>
          <param-value>설정값</param-value>
          <init-param>
          </servlet>
          <servlet-mapping>
          <servlet-name>
          </servlet-name>
          <url-pattern>
          </url-pattern>
          </servlet-mapping>
          </web-app>


* 사용자가 요청한 URL이 이 패턴과 일치하면 이름을 확인하여 웹페이지 표현

## XML 문법의 기초
* <?xml version="1,0" encoding="UTF-8" ?>

## parameter, parametervalue 메서드는 기억하기 


## int 메서드와 destroy 메서드
## init() - 가장 처음 호출(한번만)
* ServletConfig 구현객체 -> 설정값 조회
* String getinitParameter(String name)
* 요청 메서드 호출 - 여러번 
## destroy() - 가장 마지막에 호출(한번만)



## WebServlet (12:18분까지 웹기초 -> 필터와 레퍼)
* url mapping 정보를 제공 


# 필터와 래퍼

* * * 

## 필터란?
* 요청과 응답 사이에서 걸러주는 기능 