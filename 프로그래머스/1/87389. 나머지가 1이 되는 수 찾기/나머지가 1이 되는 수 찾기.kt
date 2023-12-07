class Solution {
    fun solution(n: Int): Int {
        //i는 2부터 n-1까지의 값을 가짐 n이 100이면 2부터99까지
        for(i in 2..n-1){
            //n%i 를 해서 나머지가 1 이 나오면 바로 리턴하여 값 출력, 100 % 2부터 99까지를 나누고 그 중 가장 먼저 1이 되는 i를 찾아 출력
        if(n%i == 1) return i
        }
        return 0
    }
}
