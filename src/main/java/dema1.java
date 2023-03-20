public class dema1 {
    public static void main(String[] args) {
        char c1=97;
        char c2=(char)97;
        System.out.println(c1);
        System.out.println(c2);
    }
    public static String findLexSmallestString(String s, int a, int b) {
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        for(int i=0;i<s.length();i++){
            int res1=s.charAt(i)-'0';
            if(i%2!=0){
                res1=(res1+a)%10;
            }
            char res2=s.charAt((s.length()+i-b)%s.length());
            System.out.println(res2);
            sb1.append((char)(res1+'0'));
            sb2.append(res2);
        }
        for(int i=0;i<sb1.length();i++){
            if(sb1.charAt(i)<sb2.charAt(i)){
                return sb1.toString();
            }
            else if(sb1.charAt(i)>sb2.charAt(i)){
                return sb2.toString();
            }
        }
        return sb1.toString();
    }
}
