public int calculate(String s) {
    s = s.replaceAll(" ", "");
    if (s.length() == 0) return 0;
    // the basic idea is, an expression 1 + 2 * 3 / 4 - 5 * 6 can be split into (+1), (+2*3/4), (-5*6). So we keep the product like (-5*6), if there is a "+/-" after the product, we add it to the result.
    int n = s.length();
    int prod = 1, res = 0, d = 0;
    char prevOp = '+';
    for (int i = 0; i < n; i++) {
        char c = s.charAt(i);
        if (Character.isDigit(c)) {
            d = d * 10 + c - '0';
        } 
        if (!Character.isDigit(c) || i == n - 1) {
			// update the product if this is the first digit in it, like +3
            if (prevOp == '+') prod = d; 
			// update the product if this is the first digit in it, like -3
            else if (prevOp == '-') prod = -d;
			// update the product if this is not the first digit in it, like +4*5/6...*3
            else if (prevOp == '*') prod *= d;
			// update the product if this is not the first digit in it, like +4*5/6.../3
            else prod /= d;
			// if this is the end or we have "+/-", we can add it up, and prepare for a new product 
            if (c == '+' || c == '-' || i == n - 1) {
                res += prod;
                prod = 1;
            }
			// anyway, the digit is over, so update the digit
            d = 0;
            prevOp = c;
        }
    }
    return res;
}