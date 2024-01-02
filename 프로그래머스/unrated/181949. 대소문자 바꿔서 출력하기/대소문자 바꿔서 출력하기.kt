fun main(args: Array<String>) {
       val str = readLine() ?: return // 사용자로부터 문자열을 입력받음,Null Safety를 고려하여 ?:return 코드 사용

    // 문자열을 순회하면서 각 문자의 대소문자를 바꾸어 출력
    for (char in str) {
        val resultChar = if (char.isUpperCase()) {
            char.toLowerCase()
        } else {
            char.toUpperCase()
        }
        print(resultChar)
    }

}