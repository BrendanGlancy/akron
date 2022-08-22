class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> numbersMap = new HashMap<>();
        numbersMap.put('I',1);
        numbersMap.put('V',5);
        numbersMap.put('X',10);
        numbersMap.put('L',50);
        numbersMap.put('C',100);
        numbersMap.put('D',500);
        numbersMap.put('M',1000);
        int result = 0;

        for (int i = s.length() - 1;  i >= 0; i--) {
            int value = numbersMap.get(s.charAt(i));

            if (value )

        }

    }
}
