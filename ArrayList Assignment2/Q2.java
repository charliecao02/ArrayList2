import java.util.ArrayList;
class Q2{
    public static void main(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Q1 q = new Q1();
        list = q.makeList(n);
        list = q.sieve(list);
        Goldbach(list, n);
    }
    public static void Goldbach(ArrayList<Integer> list, int n){
        for(int i=0;i<list.size();i++){
            if(list.indexOf(n-list.get(i))!=-1){
                System.out.print(list.get(i) + "," + (n-list.get(i)));
                break;
            }
        }
    }
}