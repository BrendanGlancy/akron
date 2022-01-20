class Solution {
    public boolean isPalindrome(String s) {

        // remove all chars besides letters
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // reverse the string
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println(reverse);

        if (reverse.equals(s)) {
            return true;
        } else {
            return false;
        }

    }
}
