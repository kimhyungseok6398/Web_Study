# TDD

* * *

## TDD란?

## maven
* 빌드, 의존성(필요한 라이브러리) jar(java Archive)관리, 베포, 테스트 툴

## 설치
* 자바 설치, JAVA, HOME 환경변수 설정
* C:\Users\bb124\OneDrive\바탕 화면\김형석\apache-maven-3.9.6\bin

## 사용
* maven 프로젝트 생성
* mvn archetype:generate
* (groupid) : 소속된 그룹(도메인 방식)
* (artifactid) : 프로젝트 구분 명칭

## 프로젝트 디렉토리 구조 
* 클래스 패쓰 : 클래스 파일을 인식할 수 있는 경로 

* src/main/java (작성하는 자바코드)

* src/main/resource : 정적 자원
* 설정 파일 
* Css. js, 이미지

* src/test/java (테스트 자바코드)
* src/test/resource : 테스트시 필요 정적자원 

  * pom.xml : maven 설정 파일 
          <properties>
          <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
          <maven.compiler.source>20</maven.compiler.source>
          <maven.compiler.target>20</maven.compiler.target>
          </properties>

## 순서
* 원하는 폴더 -> >mvn archetype:generate -> 2095 나오면 엔터 -> 8 (최신버전 으로 엔터) -> 그룹 아이디 : koreait -> artifactid : day01 -> 스냅샷 1.0 -> 패키지 그대로 엔터 -> 이대로 하겠다 Y

## 의존성 설정 : <dependencies>, </dependendies>
* 사용자명/.m1 -> 메이븐 레포지토리 (공유)
* Ex) C:\Users\bb124\.m2\repository\junit\junit

## Scope
* compile(기본값) : 빌드시 포함, 베포시 포함
* runtime : 빌드시 포함 X , 실행할때는 필요한 라이브러리
* provided : 개발시에만 필요, 빌드 및 배포시에는 미포함 -> 플랫폼 내에서 제공되는 라이브러리
* Ex) serviet-api, serviet.jsp-api => 포함되어 있으면 에러 발생!
* test : 테스트시에만 필요한 라이브러리

* mvn compile : java 파일 -> class 컴파일 (target 폴더 생성)

* mvn clean : 컴파일 소스 전체 지우기(target 폴더 삭제)
* 예) 기존 컴파일 소스 삭제후 다시 컴파일

* mvn clean compile => 깔끔하게 하기위해 삭제하고 다시 컴파일 

* mvn test : 테스트 케이스를 실행(전체)

* mvn package : 배포 파일 생성(jar) : build -> compile ->  test -> package(jar)
* -> 테스트 미 통과시 배포 X , mvn) clean package

# 여기까지 했던 명령어들은 CMD로 설정
* 더 쉽게 인텔리제이에서 설정가능 

## Lombok
* 의존설정
* 사용

## 참고)
* Builder 패턴