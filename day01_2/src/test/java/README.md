## TDD ( 07/ 17  스프링 보강시작)
* Junit5 : 단위 테스트

## 단위 테스트 : 기능에 대한 테스트(메서드)
* 기능 :  service
* 예 : JoinService

## 통합테스트 : MockMvc

## 의존성 설정(단위테스트)
* Junit-jupiter
* maven-surefire-plugin(maven 검색(괄호에도 plugin으로 바꿔줘야함))


## @Test 에노테이션과 테스트 메서드
* -- 각 메서드 : 테스트단위 / @Test 에노테이션으로 지정
* -- 테스트의 종류를 쉽게 파악할수 있는 메서드명


## 주요 단언 메서드(lectuteETC/TDD/Junit/1.Junit 기초 1 메서드 한번씩 보기)
* 예상되는 값이 나오는지
* 예상되는 예외가 발생하는지
* 예상하는 값이 true,false


## 참고)
## TDD 기본원칙
* 가장 쉬운 테스트 -> 어려운 테스트 -> 기능완성
* 테스트가 주 목적이 아니라 설계!! , 부가적으로 테스트가 이뤄진다.
* 테스트 -> 리펙토링 -> 테스트 -> (지속적인 리펙토링)


## asserThrows -> 반환값 : 발생된 예외 객체
## 테스트 라이프 사이클
## @BoforeEach( 더 많이 쓰임 )
* 각각 모든 단위 테스트메서드 실행전에 처리될 메서드
* 테스트시에 필요한 공통 초기화


## @AfterEach
* 각각 모든 단위 테스트메서드 실행후에 처리될 메서드
* 테스트 완료후 정리 작업(예 - 임시 파일 삭제...)


## @BeforeAll
* 테스트가 실행되기전 한번 실행메서드(static 형태에 메서드)


## @AfterAll
* 모든 테스트가 실행후 한번만 실행 메서드(static 형태에 메서드)


## @DisplayName,@Disabled
* @DisplayName : 단위 테스트에 대한 설명
* 클래스명 위
* 단위 테스트 메서드 위

## @Disable : 테스트 제외

## asserAll
* 여러 단언들을 한꺼번에 실행

## @TempDir : 임시 파일 생성
## @Timeout : 성능 체크 ( 이시간내에 성공이 되어야함)



# Mockito 

* * * 

## Mockito 사용법
* 의존설정
* mockito-core
* mokito-junit-jupiter : 모의 객체생성 편의 기능 추가
* @Mock
* @ExtendWith


## 모의 객체 생성
* mock(Class class)



## 스텝설정
* 가짜 데이터를 생성 
## given(메서드 호출)
* 반환값이 있는 경우
* willReturn(반환값)



## willThrow(예외 클래스.class) : 반환값이 없는 메서드
* given(모의 객체)
* 메서드(...)

