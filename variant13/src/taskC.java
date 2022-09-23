public class taskC {
    public static String GetResult(String str) {
        int count = 0;
        int maxCount = 0;
        int index = 0;
        int maxIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '.' && str.charAt(i) != ',') {
                count++;

                if (count == 1) {
                    index = i;
                }

                if (maxCount < count) {
                    maxIndex = index;
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }

        return str.substring(maxIndex, maxIndex + maxCount);
    }
}
