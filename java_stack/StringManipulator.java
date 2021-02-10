public class StringManipulator {
    public String trimAndConcat(String word1, String word2){
        String newWord = word1.trim() + " " + word2.trim();
        return newWord;
    }
    public Integer getIndex(String word, char letter){
        String newLetter = Character.toString(letter);
        Integer index = word.indexOf(newLetter);
        return index;
    }
    public Integer getIndexOrNull(String word, String str){
        Integer index = word.indexOf(str);
        return index;
        
    }
    public String concatSubstring(String word1, int start, int finish, String word2){
        // String substring(int beginIndex, int endIndex)
        String str = word1.substring(start, finish);
        String newWord = str + word2;
        return newWord;
    }
    
    



}