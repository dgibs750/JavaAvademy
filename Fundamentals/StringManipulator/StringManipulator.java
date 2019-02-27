public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        return str1.trim().concat(str2.trim());
    }
    public Integer getIndexOrNull(String str1, char character) {
        int index = str1.indexOf(character);
        if(index < 0) {
            return null;
        }else {
            return index;
        }
    }
    public Integer getIndexOrNull(String str1, String str2) {
        int index = str1.indexOf(str2);
        if(index < 0) {
            return null;
        }else {
            return index;
        }
    }
    public String concatSubstring(String str1, int index1, int index2, String str2) {
        return str1.substring(index1, index2).concat(str2);
    }
}