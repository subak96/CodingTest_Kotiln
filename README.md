# CodingTest_Kotiln
프로그래머스 코딩 테스트

문자 변환

.isUpperCase()는 이 메서드는 해당 문자가 대문자인지 여부를 반환, 대문자이면 true를 반환하고, 소문자이면 false를 반환합니다.
val ch: Char = 'A'
val isUpperCase: Boolean = ch.isUpperCase()
println(isUpperCase)  // 출력: true

.toLowerCase():
이 메서드는 해당 문자의 소문자 변환을 반환합니다.
원본 문자를 변경하지 않으며, 새로운 소문자 문자를 반환합니다.
val ch: Char = 'A'
val lowerCaseChar: Char = ch.toLowerCase()
println(lowerCaseChar)  // 출력: 'a'

.toUpperCase():
이 메서드는 해당 문자의 대문자 변환을 반환합니다.
원본 문자를 변경하지 않으며, 새로운 대문자 문자를 반환합니다.
val ch: Char = 'a'
val upperCaseChar: Char = ch.toUpperCase()
println(upperCaseChar)  // 출력: 'A'
