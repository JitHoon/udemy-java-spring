/*
 * 1. Operator
 * 
 * + - * / % (//, ** 없음 ㅋㅋ)
 * 리터럴 : 데이터(값) 그 자체를 뜻한다. 즉, 변수에 넣는 변하지 않는 데이터를 의미
 * PRECEDENCE (우선 순위): * / % > + -
 * 
 */

/*
 * 2. System.out.println()
 * 
 * class : System
 * parameter : out
 * method : println
 * 
 * System.out.println("Hello \"World")
 * Hello "World
 * 
 * System.out.println("Hello \\World")
 * Hello \World
 * 
 * System.out.println("Hello\nWorld")
 * System.out.println("Hello\tWorld")
 */

/*
 * 3. Math. methods
 * 
 * Math.random()
 * Math.min(1,0)
 */

/*
 * 4. jshell 여러줄 사용
 * 
 * System.
 * ...> out.
 * ...> println(
 * ...> "hello")
 * 
 * 혹은 ; 사용
 */

/*
 * 5. System.out.printf().println()
 * 
 * System.out.printf("%d * %d = %d", 5, 2, 5*2)
 * 5 * 2 = 10$22 ==> java.io.PrintStream@50040f0c
 * 
 * System.out.printf("%d * %d = %d", 5, 2, 5*2).println()
 * 5 * 2 = 10
 * 
 * %d %f %s
 */

/*
 * 6. variable
 * 
 * java는 유형 중심의 언어이다.
 * 
 * byte // 8 bits -128 to 127
 * short // 16 bits -3만2천 to 3만2천
 * int // 32 bits -20억 to 20억
 * long // 64 bits
 * float // 32 bits float f = 4.0f
 * double // 64 bits
 * char // 16bits char c ='A'
 * boolean // true or false
 * 
 * int number = 15
 * int number2 = 25
 */

/*
 * 7. variable 규칙
 * 
 * camelCase
 * 
 * 사용할 수 없음
 * -, 숫자가 가장 앞, java 키워드 (int 등)
 */

/*
 * 8. 문자열 결합
 * 
 * "1" + 2 // "12" 출력
 * 
 * 2가 int 변수여도 가능
 */

/*
 * 9. assignment
 * 
 * "1" + 2 // "12" 출력, 2가 int 변수여도 가능
 * 
 * ++variable, variable++
 * --variable, variable--
 */

/*
 * 10. for
 * 
 * for(초기값;조건;업데이트) {
 * statement;
 * }
 * 
 * 초기값, 조건, 업데이트 없을 때
 * for(;;); // 무한 반복
 * 
 * 초기값 없을 때
 * int i =1
 * for(;i<=10;i++); // i=11
 * 
 * 초기값, 업데이트 여러개 가능
 * int i = 0
 * int j = 0
 * for(i=1, j=2; i<=10;i++, j++); // i=11, j==12
 */

/*
 * 11. if
 * 
 * if (condition) {
 * statement;
 * }
 */  