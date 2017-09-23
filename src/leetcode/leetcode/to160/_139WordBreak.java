package leetcode.leetcode.to160;

/**
 * Created by Paul on 11/2/15.
 * question link
 * <p/>
 * answer link
 */
//    次优解不能在lintcode通过http://blog.csdn.net/ljphhj/article/details/21643391
//    假设现在指针看到第i个字母
//那么从0到i这些字母组成的字符串能不能用字典的单词分隔只要看
//0到j中是不是有在字典中，j到i是不是也同时在字典中。如果都在说明可以组成，
//而0到j可以在布尔型数组里预存结果。所以就只要看j到i在不在就行。
public class _139WordBreak {
}
