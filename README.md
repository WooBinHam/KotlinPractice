# KotlinPractice

## 코틀린 제공 표준 라이브러리 함수(Chap6)
- 람다식을 사용ㅇ하는 코틀린의 표준 라이브러리에서 let(), apply(), with(), also(), run() 등 여러가지 표준 함수를 제공하고 있다.
- 표준 함수들은 대략 확장 함수 형태의 람다식으로 구성되어 있다.

|함수명|람다식의 접근 방법|반환 방법|
|------|---|---|
|T.let|it|block 결과|
|T.also|it|T caller(it)|
|T.apply|this|T caller(this)|
|T.run 또는 run|this|block 결과|
|with|this|Unit|
