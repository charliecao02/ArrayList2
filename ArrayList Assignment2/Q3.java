import java.util.ArrayList;
class Q3{
    static public void main(String s1, String s2){
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        ArrayList<Integer> n2 = new ArrayList<Integer>();
        ArrayList<Integer> sum = new ArrayList<Integer>();
        
        for(int i=0;i<s1.length();i++){
            n1.add(Integer.parseInt(s1.substring(i,i+1)));
        }
        for(int i=0;i<s2.length();i++){
            n2.add(Integer.parseInt(s2.substring(i,i+1)));
        }
        
        System.out.print("First number : ");
        for(int i=0;i<n1.size();i++){
            System.out.print(n1.get(i));
        }  
        System.out.println("");
        System.out.print("Second Number: ");
        for(int i=0;i<n2.size();i++){
            System.out.print(n2.get(i));
        }
        System.out.println("");
        
        int len=0;
        if(n1.size()>n2.size()){
            len=n1.size();
            int tsize1=n1.size();
            int tsize2=n2.size();
            for(int i=0;i<tsize1-tsize2;i++){
                n2.add(0,0);
            }
        } else if(n2.size()>n1.size()){
            len=n2.size();
            int tsize1=n1.size();
            int tsize2=n2.size();
            for(int i=0;i<tsize2-tsize1;i++){
                n1.add(0,0);
            }
        } else len=n1.size();
       
        int carry=0;
        for(int i=len-1;i>=0;i--){
            if(n1.get(i)+n2.get(i)+carry>=10){
                sum.add(0, (n1.get(i)+n2.get(i) + carry)%10);
                carry=1;
            } else {
                sum.add(0, (n1.get(i)+n2.get(i) + carry)%10);
                carry=0;
            }
        }
        
        if(n1.get(0)+n2.get(0)+carry>=10){
            len++;
            sum.add(0, 1);
        } 
        
        System.out.print("Sum          : ");
        for(int i=0;i<len;i++){
            System.out.print(sum.get(i));
        } 
    }
}