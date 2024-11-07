public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }
  
    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive! 
       
       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
  
        DO THIS WITH A FOR LOOP
      */  
    public int countCharacters(String character, String searchString) {
      /* to be implemented */
      String lowerChar = character.toLowerCase();
      String lowerString = searchString.toLowerCase();
      int count = 0;
      for (int i = 0; i < searchString.length(); i++) {
        if (lowerChar.equals(lowerString.substring(i, i + 1))) {
            count++;
        }
      }
      return count;
    }
    
    /* Returns the original string reversed 
     
     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */  
    public String reverseString(String origString) {
      /* to be implemented */
      String reverse = "";
      for (int i = origString.length(); i > 0; i--) {
        reverse += origString.substring(i - 1, i);
      }
      return reverse;
    }

    public String removeA(String str) {
      // implement me
      String result = "";
      for (int i = 0; i < str.length(); i++) {
        if (str.substring(i, i + 1).equals("a")) {
          result += "";
        } else {
          result += str.substring(i, i + 1);
        }
      }
      return result;
    }

        /* Returns a String with all instances of "searchChar" in "origString" replaced with
     "replaceChar"; matches should be case sensitive (i.e. no need to worry about
      lowercase vs. uppercase)
     
     - if searchChar = "a", origString = "canned beans and bananas", replaceChar = "*"
       this method returns "c*nned be*ns *nd b*n*n*s" (A not a match because of case)
     - if searchChar = "t", origString = "Ratatattat", replaceChar = "p"
       this method returns "Rapapappap"
     - if searchChar = "!", origString = "Nice! Day today!", replaceChar = "?"
       this method returns "Nice? Day today?"
     - if searchChar = "i", origString = "it’s the brain drain pain train",
       replaceChar = "I", this method returns "It’s the braIn draIn paIn traIn"
     - if searchChar = "i", origString = "it’s the brain drain pain train",
       replaceChar = " ", this method returns " t’s the bra n dra n pa n tra n"
     - if searchChar = "A", origString = "ABABABABABC", replaceChar = "D"
       this method returns "DBDBDBDBDBC"
     - if searchChar = "a", origString = "ABABABABABC", replaceChar = "D"
       this method returns "ABABABABABC" (no matches because of case)

    PRECONDITION: searchChar and replaceChar are single characters and are not equal
    */  
    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
      /* to be implemented */
      String result = "";
      for (int i = 0; i < origStr.length(); i++) {
        if (origStr.substring(i, i + 1).equals(searchChar)) {
          result += replaceChar;
        } else {
          result += origStr.substring(i, i + 1);
        }
      }
      return result;
    }

        /* DOES THE EXACT SAME THING AS replaceCharacterV1, except using a while loop

    PRECONDITION: searchChar and replaceChar are single characters and are not equal
      */
    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
      /* to be implemented */
      String result = "";
      int idx = 0;
      while (idx < origStr.length()) {
        if (origStr.substring(idx, idx + 1).equals(searchChar)) {
          result += replaceChar;
        } else {
          result += origStr.substring(idx, idx + 1);
        }
        idx++;
      }
      return result;
    }
      /* Returns the number of times "searchString" appears in "origString";
     matches should be case sensitive (i.e. no need to worry about lower vs. uppercase)
     
     Examples:
     - if searchString = "an" and origString = "canned beans and bananas",
       this method returns 5: canned beans and bananas
     - if searchString = "tat" and origString = "Ratatattat",
       this method returns 3: Ratatattat (note the overlap!)
     - if searchString = "lower" and origString = "sunflower",
       this method returns 1: sunflower
     - if searchString = "haha" and origString = "Hahahahaha",
       this method returns 3: Hahahahaha (note the overlap!)
     - if searchString = "rain" and origString = "rain drain pain train",
       this method returns 3: rain drain pain train
     - if searchString = "was" and origString = "I was about to call you",
       this method returns 1: I was about to call you
     - if searchString = "but" and origString = "I was about to call you",
       this method returns 0: I was about to call you
     - searchString = "i", origString = "iiiit's supercalifragilisticexpialidociousi",
       this method returns 12: iiiit's supercalifragilisticexpialidociousi
    */  
    public int countString(String searchString, String origString) {
      /* to be implemented */
      int count = 0;
      int origLen = origString.length();
      int searchLen = searchString.length();
      for (int i = 0; i < origLen - searchLen + 1; i++) {
        if (origString.substring(i, i + searchLen).equals(searchString)) {
          count++;
        }
      }
      return count;
    }

        /* Returns a String with all instances of "searchString" removed from "origString";
       matches should be case sensitive (i.e. no need to worry about lowercase vs. uppercase)
     
     - if searchString = "an" and origString = "canned beans and bananas",
       this method returns "cned bes d bas"
     - if searchString = "tat" and origString = "Ratatattat",
       this method returns "Raat"
     - if searchString = "lower" and origString = "sunflower",
       this method returns "sunf"
     - if searchString = "haha" and origString = "Hahahahaha",
       this method returns "Ha" (case sensitive, so leading "Haha" isn’t a match)
     - if searchString = "HAHA" and origString = "Hahahahaha",
       this method returns "Hahahahaha" (no matches due to case)
     - if searchString = "rain" and origString = "it’s the brain drain pain train",
       this method returns "it’s the b d pain t"
     - if searchString = "lol" and origString = "lolololol",
       this method returns "ool"
     - if searchString = "was" and origString = "I was about to call you, wasn’t I?",
       this method returns "I  about to call you, n’t I?"
     - if searchString = "but" and origString = "I was about to call you, wasn’t I?",
       this method returns "I was about to call you, wasn’t I?" (no matches)
     - if searchString = "AB" and origString = "ABABABABABC",
       this method returns "C"
     - if searchString = "AB" and origString = "AAAAABBBBBC",
       this method returns "C"
    */  
    public String removeString(String searchString, String origString) {
      /* to be implemented */
      int idx = origString.indexOf(searchString);
      while (idx != -1) {
        if (idx >= 0) {
          origString = origString.substring(0, idx) + origString.substring(idx + searchString.length(), origString.length());
          idx = origString.indexOf(searchString);
        }
      }
      return origString;
    }

    /* Prints all integers from fromNum through toNum, separated by
     a commas and a space, on a single line;
     there should NOT be a comma after the final number.
     If fromNum == toNum, print just the number and no comma.
     If fromNum > toNum, the numbers should be printed in descending order.
     After all numbers are printed, move the cursor to the next line.
     
     Examples:
     - if fromNum = 0 and toNum = 5, this method should print: 0, 1, 2, 3, 4, 5
     - if fromNum = -3 and toNum = 2, this method should print: -3, -2, -1, 0, 2
     - if fromNum = 8 and toNum = 1, this method should print: 8, 7, 6, 5, 4, 3, 2, 1
     - if fromNum = 4 and toNum = 4, this method should print: 4
     - if fromNum = 0 and toNum = 0, this method should print: 0
    */  
    public void commaSeparated(int fromNum, int toNum) {
      /* to be implemented */
      if (fromNum == toNum) {
        System.out.println(fromNum);
      } else if (fromNum < toNum) {
        while (fromNum < toNum) {
          System.out.print(fromNum + ", ");
          fromNum++;
        }
        System.out.println(fromNum);
      } else {
        while (fromNum > toNum) {
          System.out.print(fromNum + ", ");
          fromNum--;
        }
        System.out.println(fromNum);
      }
    }

   /* Returns true if myString is a palindrome, i.e. the characters read the same
    forwards and backwards, and false otherwise. Don't worry about case.
    NOTE!  Spaces should be disregarded when determining if it's a palindrome.
    "no lemon no melon" is a palindrome!
    
     Examples:
     - myString = "A", return true
     - myString = "mom", return true
     - myString = "dad", return true
     - myString = "bob", return true
     - myString = "noon", return true
     - myString = "deed", return true
     - myString = "12321", return true
     - myString = "aaaaaaa", return true
     - myString = "baaabaaab", return true
     - myString = "civic", return true
     - myString = "kayak", return true
     - myString = "racecar", return true
     - myString = "my gym", return true
     - myString = "step on no pets", return true
     - myString = "45TTGTT54", return true
     - myString = "no lemon no melon", return true
     - myString = "a nut for a jar of tuna", return true
     - myString = "! 1 2 3 4 M 6M4321!", return true
     - myString = "was it a car or a cat i saw", return true
     - myString = "a man a plan a canal panama", return true
     - myString = "mod", return false
     - myString = "dang", return false
     - myString = "boo", return false
     - myString = "noonish", return false
     - myString = "indeed", return false
     - myString = "1234432", return false
     - myString = "civics", return false
     - myString = "kayaks", return false
     - myString = "racing car", return false
     - myString = "my gyms", return false
     - myString = "step on pets", return false
     - myString = "1 3 2 4 3 2 1", return false
     - myString = "AAADAA", return false
     - myString = "BaaBaaaB", return false
    */
    public boolean isPalindrome(String myString) {
      /* to be implemented */
      myString = removeString(" ", myString);
      String reverse = reverseString(myString);
      if (myString.equals(reverse)) {
        return true;
      } else {
        return false;
      }
    }
   /* Prints the String toPrint num times on a single line separated by spaces,
    within an opening bracket and closing bracket; there should not be a space
    between the final toPrint and the closing bracket,
    e.g. [hello hello hello hello]
    
    If numtimes <= 0, print just empty brackets (no space): []
    After printing the closing bracket, move the cursor to the next line.
     
    Examples:
    - toPrint = "hello" and num = 4, print: [hello hello hello hello]
    - toPrint = "beetlejuice" and num = 3, print: [beetlejuice beetlejuice beetlejuice]
    - toPrint = "hi there" and num = 2, print: [hi there hi there]
    - toPrint = "boop!" and num = 1, print: [boop!]
    - toPrint = "dance party" and num = 0, print: []
    - toPrint = "anything" and num = -4, print: []
    */
    public void multiPrint(String toPrint, int num) {
      /* to be implemented */
      if (num <= 0) {
        System.out.println("[]");
      } else {
      System.out.print("[");
      for (int i = 0; i < num - 1; i++) {
        System.out.print(toPrint + " ");
      }
      System.out.println(toPrint + "]");
    }
  }
}