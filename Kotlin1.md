# Kotlin1

1. 함수
  - 메인함수 
    fun main(){}
  - 함수 정의
    fun 함수명(파라미터명 : 타입) : 리턴타입 {}
  - 파라미터와 리턴이 없는 함수(Unit 생략가능)
    fun helloWorld() : Unit {}
  - 파라미터와 리턴이 있는 함수
    fun add(a:Int, b:Int):Int{ return a+b }
    
2. 변수
  - val : 변할 수 없는 값
    val 변수명 : 타입 = 값
  - var : 변할 수 있는 값
    var 변수명 : 타입 = 값
 
3. String Template
  - 문자열 사이에 변수값을 활용할 수 있음
  - $변수명 or ${변수명}
  - $를 문자로 사용하고 싶은 경우 "\$"사용

4. 주석
  - 한 줄 주석 : //
  - 여러 줄 주석 : /**/

5. 조건식
  - if : result = if(a>b) a else b 로 값 반환 가능
  - when : when(변수) in 조건 -> 동작 으로 표현
           반환 값이 반드시 필요한 경우 else -> 동작 필요
  
6. Expression / Statement
  - Expression : 어떠한 작업을 통해 결과값을 만들어 내는 것(값을 반환)
                코틀린의 모든 함수는 Expression (리턴값이 없어도 Unit을 반환하기 때문)
                if문도 Expression으로 활용 가능
  - Statement : 작업을 하고 결과값을 만들지 않는 것 (값을 반환하지 않음) 

7. Array / List
  - Array : 기본적으로 크기가 정해짐(메모리 할당), 선언시 크기지정 필요
            val array = arrayOf(1,2,3)
  - List  : 변화 가능한 리스트(대표적으로 ArrayList)와 불가능한 리스트로 나누어짐
            val list = listOf(1,2,3) 이건 값 변경 불가능
  * any타입으로 여러타입을 리스트에 넣을 수 있음
  
8. 반복문
  - for : for (name in student){} 리스트의 값 활용
          for ((index, name) in student.withIndex()){} 리스트의 인덱스와 값 활용
          for (i in 1..10) 1~10
          step 2 2씩 증가, 10 downTo 1 10~1, 1 until 100 1~99
  - while : while(조건) { 동작 } 조건이 참일 때 까지 반복
  
9. NULL
  - NPE : 자바에서는 Null Point Exception이 런타임 에러 코틀린은 ? 표현으로 컴파일시 방지할 수 있음
  - var 변수명 : 타입? = null 
  - 변수명?.함수() 변수가 null이라면 null 반환 null이 아니라면 함수 실행
  - ?:(엘비스 연산자) : null일 경우에 디폴트값 지정 var 변수명 = (null일 수 있는 변수명?:"디폴트값")
  - !! 연산자 : null 일 수 있는 변수를 사용자가 컴퓨터에게 null이 아님을 확신해 주는것, 사용의 지양함
  - let 함수 : 자신의 리시브 객체를 람다식 내부로 옮기는 것
               email?.let{ 동작 } email이 null이 아니면 함수가 동작함

10. 클래스
  - 코틀린에서는 클래스명과 파일명이 같지 않아도됨
  - 정의 : class 클래스명{}
  - 생성 : val 객체명 = 클래스명()
  - 생성자 : class 클래스명 constructor(val 필드명 : 타입 = "디폴트값") {} constructor, 디폴트값 생략가능, 디폴트 값이 없으면 객체 생성시 반드시 생성자 값을 넣어줘야함
  - 부 생성자 :  constructor(필드명 : 타입) : this(위임받을 필드명){} this로 주 생성자의 위임을 받음
  - init{} : 객체생성시 할 동작을 정의, 가장 먼저 실행됨 
  - 상속 : 코틀린에서 클래스는 기본적으로 파일 클래스이기 때문에 같은 파일내에 있다고 해서 그냥 접근할 수 없음
           open 키워드 사용
           open class 부모클래스명 {}
           class 자식클래스명 : 부모클래스명(){}
           하나의 부모만 상속받을 수 있음
  - 오버라이딩 : 오버라이딩할 부모의 메소드도 open 키워드 사용
                open fun 함수명(){}
                override fun 함수명(){}
                
11. 데이터 클래스
  - 자바의 POJO 클래스를 대신할 클래스, 자바의 불필요한 작업을 줄여줌
  - data class 클래스명(필드명 : 타입 ....)
  - toString(), hashCode(), equals(), copy()를 자동으로 만들어줌
  
12. companion object
  - 자바의 static 대신에 사용
  - 정적인 메소드나 정적 변수를 선언할 때 사용
  - 객체를 만들어주는 팩토리 역할
  - 선언 : companion object{}
  - val 객체명 = 클래스명.Companion.create() Companion 생략가능
  - 이름을 붙이는 경우 : companion object 컴패니언오브젝트명{} 
  - val 객체명 = 클래스명.팩토리명.함수명() Companion 사용할 수 없음, 컴패니언오브젝트명을 반드시 붙여야함
  
13. object class
  - 모든 앱을 실행할 때 단 하나의 객체만 생성(싱글톤 패턴)
  - 객체를 만들어내는 팩토리 역할
  - object 클래스명{}
  
14. 람다
  - value 처럼 다룰수 있는 익명함수 
  - 메소드의 파라미터로 넘겨줄 수 있음
  - 메소드의 리턴값으로 사용할 수 있음
  - 람다의 기본 정의 : val 람다이름 : (파라미터 타입) -> (리턴타입) = {파라미터리스트 -> 함수바디}
  - ex) : val squaare : (Int) -> (Int) = {number -> number*number}
  - 람다의 표현 방식
  - fun 함수명(람다:(람다 파라미터 타입)-> 람다 리턴타입) : 함수 리턴타입 {}
  - 1) val lamda = {파라미터 변수명 : 타입 -> 람다값} // 람다정의
       함수명(lamda)
  - 람다 리터럴 : 함수 선언을 하지않고 중괄호에 함수 바디를 넣는 방식
  - 2) 함수명({람다 작업})
  - 3) 함수명 {람다 작업} // 함수의 마지막 파라미터가 람다식인 경우 소괄호 생략가능 it : 하나들어 가는 파라미터 
  - 확장함수 : 클래스에 추가작업을 하고 싶은 경우 활용
              클래스명.() -> 리턴타입 = {this + 추가작업}
