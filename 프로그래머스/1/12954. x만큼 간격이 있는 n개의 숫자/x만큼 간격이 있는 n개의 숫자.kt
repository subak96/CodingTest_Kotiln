class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray (n) {0}
        
        for (i in 0 until n){
            answer[i] = (i.toLong() + 1) * x.toLong()
        }
        return answer
    }
}
