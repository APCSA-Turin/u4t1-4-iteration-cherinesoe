public class StringLoopsFirst {
    // default constructor; no instance variables
    public StringLoopsFirst() { }
  
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
  }
  