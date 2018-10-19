/*
反其道而行，取一个str与其他strs找index（是否包含）， 找不到（不包含）就把str减短
 */
package string;

/**
 *
 * @author XBao
 */
public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String str = strs[0];
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(str)!=0){
                str = str.substring(0, str.length()-1);
            }
        }
        return str;
    }
    
    public static void main(String[] args){
        System.out.println(new LongestCommonPrefix_14().longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
            
}
