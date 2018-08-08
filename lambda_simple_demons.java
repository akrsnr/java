interface StringFunc {
    String func(String str);
}

class LambdaArgumentDemo {
    // This method has a functional interface as the type of its
    // first parameter. Thus, it can be passed a reference to any
    // instance of that interface, including an instance created
    // by a lambda expression. The second parameter specifies the
    // string to operate on.
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        // reverse the string
        StringFunc reverser = s -> "\u202E" + s;
        StringFunc caseReverse = s -> {
            var strBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                    strBuilder.append((char)(s.charAt(i) ^ ' '));
                }
                else {
                    strBuilder.append(s.charAt(i));
                }
            }
            return strBuilder.toString();
        };
        StringFunc toHypens = s -> {
            var strBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    strBuilder.append('-');
                }
                else {
                    strBuilder.append(s.charAt(i));
                }
            }
            return strBuilder.toString();
        };

        System.out.println(reverser.func("soner"));

        String inStr = "Lambda Expressions Expand Java";
        String outStr;
        System.out.println("Here is input string: " + inStr);

        outStr = changeStr(reverser, inStr);
        System.out.println(outStr);

        outStr = changeStr(caseReverse, inStr);
        System.out.println(outStr);

        outStr = changeStr(toHypens, inStr);
        System.out.println(outStr);


    }

}
