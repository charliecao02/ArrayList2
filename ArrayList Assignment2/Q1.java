import java.util.ArrayList;
class Q1{
    public static ArrayList<Integer> main(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list=makeList(n);
        list=sieve(list);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+", ");
        }
        return list;
    }
    public static ArrayList<Integer> sieve(ArrayList<Integer> list){
        for(int p=2;p<=list.size();p++){
            for(int i=p+1;i<list.size();i++){
                if(list.get(i) % p==0){
                    list.remove(i);
                    i--;
                }  
            }
        }
        return list;
    }
    public static ArrayList<Integer> makeList(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<n;i++){
            list.add(i+1);
        }
        return list;
    }
}