class Solution {
    fun solution(x: Int, n: Int): LongArray {
        // 배열의 크기가 n 만큼 생성 n이 4면 0~3까지 4개의 배열이 생김
        var answer = LongArray (n)

        //until은 n-1의 값까지만 가짐, n이 4라면 0,1,2,3까지를 가지고 i에 대입
        for (i in 0 until n){
            //toLong()는 정수를 Long으로 변환하는 메서드
            answer[i] = (i.toLong() + 1) * x.toLong()
        }
        return answer
    }
}
//Long는 정수 자료형으로 Int보다 더 큰값을 가짐 Int = 32비트 , Long = 64비트 , Int는 상대적으로 작은 정수 값을 다룰 때 사용하고, Long은 더 큰 범위의 정수 값을 다룰 때 사용
