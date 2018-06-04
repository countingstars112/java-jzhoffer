package com.jzoffer.string;

/**
 * * From  xxwy
 */
public class Solution {

    /**
     * 请实现一个函数，将一个字符串中的空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        String replace = s.replace(" ", "%20");
        return s;
    }

    public String replaceSpace2(StringBuffer str) {
        int StrLength = str.length();
        char[] cs = new char[StrLength];
        cs = str.toString().toCharArray();
        StringBuffer newstr = new StringBuffer();
        for(int i=0;i<cs.length;i++) {
            if(cs[i]==' ') {
                newstr.append("%20");
            }
            else {
                newstr.append(cs[i]);
            }
        }
        return newstr.toString();
    }
}

