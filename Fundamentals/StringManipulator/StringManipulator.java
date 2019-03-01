public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        return str1.trim().concat(str2.trim());
    }
    public Integer getIndexOrNull(String str1, char character) {
        int idx = str1.indexOf(character);
        if(idx < 0) {
            return null;
        }else {
            return idx;
        }
    }
    public Integer getIndexOrNull(String str1, String str2) {
        int idx = str1.indexOf(str2);
        if(idx < 0) {
            return null;
        }else {
            return idx;
        }
    }
    public String concatSubstring(String str1, int idx1, int idx2, String str2) {
        return str1.substring(idx1, idx2).concat(str2);
    }
}