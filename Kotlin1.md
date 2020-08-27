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
  - $를 문자로 사용하고 싶은 경우 \$사용

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
          for (i in 1..10) 1~10, step 2 추가 시 2씩 증가, 10 downTo 1 10~1, 1 until 100 1~99
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
  - 
