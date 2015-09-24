9. High Frequency
九章算法IT求职面试培训 第9章
www.ninechapter.com
Outline
1. Single Number I, II, III
2. Majority Number I, II, III
3. Best Time to Buy and Sale Stock I, II, II
4. Subarray I, II, III, IV
5. 2-Sum, 3-Sum, 4-Sum, k-Sum, 3-Sum Closest
6. Quick Questions
7. Partition Array
Single Number
http://lintcode.com/zh-cn/problem/single-number/
http://www.ninechapter.com/solutions/single-number/
Single Number II
http://www.lintcode.com/en/problem/single-number-ii/
http://www.ninechapter.com/solutions/single-number-ii/
Single Number III
http://www.lintcode.com/en/problem/single-numberiii/
Majority Number
http://lintcode.com/en/problem/majority-number/
Majority Number II
http://lintcode.com/en/problem/majority-number-ii/
Majority Number III
http://lintcode.com/en/problem/majority-number-iii/
Best Time to Buy and Sell Stock
http://www.lintcode.com/en/problem/best-time-to-buy-and-sellstock/
http://www.ninechapter.com/solutions/best-time-to-buy-and-sellstock/
Best Time to Buy and Sell Stock II
http://www.lintcode.com/en/problem/best-time-to-buy-and-sellstock-
ii/
http://www.ninechapter.com/solutions/best-time-to-buy-and-sellstock-
ii/
Best Time to Buy and Sell Stock III
http://www.lintcode.com/en/problem/best-time-to-buy-and-sellstock-
iii/
http://www.ninechapter.com/solutions/best-time-to-buy-and-sellstock-
iii/
Best Time to Buy and Sell Stock IV
k transcations
state: f[i][j]表示前i天进行j次交易，能够获得的最大收益
function: f[i][j] = max{f[x][j-1] + profit(x+1, i)}
answer: f[n][k]
intialize: f[i][0] = 0, f[0][i] = -MAXINT (i>0)
Subarray
http://lintcode.com/en/problem/maximum-subarray/
http://lintcode.com/en/problem/maximum-subarray-ii/
http://lintcode.com/en/problem/maximum-subarray-iii/
Subarray II
http://lintcode.com/en/problem/minimum-subarray/
Subarray III
http://lintcode.com/en/problem/maximum-subarraydifference/
Subarray IV
http://www.lintcode.com/en/problem/subarray-sum/
http://www.lintcode.com/en/problem/subarray-sumclosest/
2-Sum
http://lintcode.com/en/problem/2-sum/
3-Sum
http://lintcode.com/en/problem/3-sum/
3-Sum Closest
http://lintcode.com/en/problem/3-sum-closest/
4-Sum
http://lintcode.com/en/problem/4-sum/
k-Sum
http://www.lintcode.com/en/problem/k-sum/
Quick Questions
● Power(x, n)
○ x^n = (x^(n/2))^2 快速幂 →O(logn)
○ http://www.lintcode.com/en/problem/fast-power/
● Sqrt(x)
○ Magic Number 0x5f3759df
○ http://www.lintcode.com/en/problem/sqrtx/
● Trailing Number of zeros in n!
○ http://www.lintcode.com/en/problem/trailing-zeros/
● O(1) Check Power of 2
○ (x-1) & x == 0 → x是2的某次幂
○ http://www.lintcode.com/problem/o1-check-power-of-2/
Partition Array
http://lintcode.com/en/problem/partition-array/
Sort Letters by Case
http://lintcode.com/en/problem/sort-letters-by-case/
Sort Colors
http://lintcode.com/zh-cn/problem/sortcolors/
Interleaving Negative &
Positive numbers
[1,2,-1,3,4,-5,-6] => [1,-1,2,-5,3,-6,4]
http://lintcode.com/zh-cn/problem/interleavingpositive-
and-negative-numbers/