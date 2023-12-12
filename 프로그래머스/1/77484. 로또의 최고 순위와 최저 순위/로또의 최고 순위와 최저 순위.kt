class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        // 맞춘 숫자 개수를 저장할 변수
        var correctCount = 0
        // 0의 개수를 저장할 변수
        var zeroCount = 0

        // 로또 번호와 당첨 번호를 비교하여 맞춘 숫자의 개수와 0의 개수를 계산
        for (num in lottos) {
            if (num == 0) {
                zeroCount++
            } else if (num in win_nums) {
                correctCount++
            }
        }

        // 최고 순위: 0을 모두 당첨 번호로 맞췄을 때와, 0을 모두 맞추지 못했을 때를 고려
        val maxRank = 7 - (correctCount + zeroCount).coerceAtLeast(1)

        // 최저 순위: 0을 모두 당첨 번호로 맞추지 못했을 때를 고려
        val minRank = 7 - correctCount.coerceAtLeast(1)

        return intArrayOf(maxRank, minRank)
    }
}
