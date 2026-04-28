class myClass{
    public int AddAll(int ... numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }

}

public class Animals {
    public static void main (String args[]) throws Exception {
        myClass summ = new myClass();
        System.out.println(summ.AddAll(1,1,1));
    }
}
