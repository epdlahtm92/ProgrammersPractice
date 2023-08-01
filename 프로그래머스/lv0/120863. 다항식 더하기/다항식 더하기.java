class Solution {
    public String solution(String polynomial) {
        int a = 0;
        int b = 0;
        if (!polynomial.contains("+")) {
            return polynomial;
        } else {
            String[] answer = polynomial.replaceAll(" ", "").split("\\+");
            for (String str : answer) {
                if (str.contains("x")) {
                    if (str.equals("x")) {
                        a += 1;
                    } else {
                        a += Integer.parseInt(str.substring(0, str.length()-1));
                    }
                } else {
                    b += Integer.parseInt(str);
                }
            }
            if (b > 0) {
                if (a > 1) {
                    return Integer.toString(a) + "x + " + Integer.toString(b);
                } else if (a == 0) {
                    return Integer.toString(b);
                } else if (a == 1) {
                    return "x + " + Integer.toString(b);
                }
            } else if (b == 0) {
                if (a > 1) {
                    return Integer.toString(a) + "x";
                } else if (a == 1) {
                    return "x";
                }
            }
        }
        return "";
    }
}