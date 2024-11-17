public class Test {
    public class test {}

    // public int maxBlock(String str) {
    //     int idx = 0;
    //     boolean same = true;
    //     int maxCount = 0;
    //     while (idx < str.length()) {
    //       int count = 0;
    //       while (same) {
    //         for (int i = idx; i < str.length() - 2; i++) {
    //           if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
    //             same = true;
    //             count++;
    //           } else {
    //             same = false;
    //           }
    //         }
    //         if (maxCount < count) {
    //           maxCount = count;
    //         }
    //       }
    //       idx++;
    //     }
    //     return maxCount;
    // }

    public int maxBlock(String str) {
        int i = 0;
        int maxCount = 0;
        while (i < str.length()) {
          for (int k = 0; k < str.length(); k++) {
            int count = 0;
            int j = str.indexOf(str.substring(i, i + 1));
            str = str.substring(j);
            if (j > i && j != -1) {
              for (int l = i; l < j; l++) {
                if (str.substring(l, l + 1).equals(str.substring(l + 1, l + 2))) {
                    count++;
                }
              }
              if (maxCount <= count) {
                maxCount = count;
              }
            }
          }
        }
        return maxCount;
      }
}
