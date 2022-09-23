public class taskA {
    public static int GetResult(String str) {
        String alph = "АБВЖИКОСУЯабвжикосуя";
        int count = 0;

        for(int i = 0; i < alph.length(); ++i) {
            if (str.charAt(0) == alph.charAt(i) && str.charAt(1) == ' ' ||
                    str.charAt(str.length() - 1) == alph.charAt(i) && str.charAt(str.length() - 2) == ' ') {
                count++;
            }
        }

        for(int i = 1; i < str.length() - 1; ++i) {
            for(int j = 0; j < alph.length(); ++j) {
                if (str.charAt(i) == alph.charAt(j) &&
                        (str.charAt(i - 1) == ' ' || str.charAt(i - 1) == ',' || str.charAt(i - 1) == '.') &&
                        (str.charAt(i + 1) == ' ' || str.charAt(i + 1) == ',' || str.charAt(i + 1) == '.')) {
                    count++;
                }
            }
        }

        return count;
    }
}