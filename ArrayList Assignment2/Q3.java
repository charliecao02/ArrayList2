import java.util.ArrayList;
class Q3{
    static public void main(String s1, String s2){
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        
        for(int i=0;i<s1.length();i++){
            n1.add(Integer.parseInt(s1.substring(i,i+1)));
        }
        for(int i=0;i<s2.length();i++){
            n2.add(Integer.parseInt(s2.substring(i,i+1)));
        }
        
        
    }
}