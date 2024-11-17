public class FRQSolutions {
    public FRQSolutions() {}

    public void printNums(int value, int numRounds) {
        //your code here
        int rand = (int) (Math.random() * 10);
        for (int i = 0; i < numRounds; i++) {
            while (rand != value) {
                System.out.print(rand);
                rand = (int) (Math.random() * 10);
            }
            System.out.println(value);
            rand = (int) (Math.random() * 10);
        }
    }

    public String longestStreak(String str) {
        //your code here
        int count = 1;
        int maxCount = 1;
        String current = "";
        String longestChar = str.substring(0, 1);
        for (int i = 0; i < str.length(); i++) {
            current = str.substring(i, i + 1);
            count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (current.equals(str.substring(j, j + 1))) {
                    count++;
                } else {
                    j = str.length() + 1;
                }
    
                if (count > maxCount) {
                    maxCount = count;
                    longestChar = current;
                }
            }
        }
        return longestChar + " " + maxCount;
    }
    
}