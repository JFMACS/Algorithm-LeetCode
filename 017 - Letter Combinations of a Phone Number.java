/**
 * 1.先计算出List中元素个数，初始化字符串数组
 * 2.从第一位开始批量编辑数组
 * 比如共9个字符串，第一位为abc，则0-2为a，3-5为b，6-8为c
 * 3.将字符串添加到List
 */
class Solution {
    static char[][] code = {"".toCharArray(), "".toCharArray(), "abc".toCharArray(),
        "def".toCharArray(), "ghi".toCharArray(), "jkl".toCharArray(),
        "mno".toCharArray(), "pqrs".toCharArray(), "tuv".toCharArray(), "wxyz".toCharArray()};
	public static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();
		if ("".equals(digits)) {
			return result;
		}
		int count = 1;
		char[] ch = digits.toCharArray();
		int[] digit = new int[ch.length];
		// 预先计算List的长度
		for (int i = 0; i < ch.length; i++) {
			digit[i] = ch[i] - '0';
			if (digit[i] != 7 && digit[i] != 9) {
				count *= 3;
			} else {
				count *= 4;
			}
		}
		String[] temp = new String[count];
		Arrays.fill(temp, "");
		int flag;//记录当前的字符
		int length = count;//记录当前字符的长度
		for (int i = 0; i < digit.length; i++) {
			
			int codeNumber = code[digit[i]].length;
			length /= codeNumber;
			flag = 0;
			
			for (int j = 0; j < count; j++) {
				if (j >= length * (flag + 1)) {
					flag ++;
				}
				temp[j] += code[digit[i]][flag % codeNumber];
			}
		}
		
		for (int i = 0; i < count; i++) {
			result.add(temp[i]);
		}
		
		return result;
	}
}
