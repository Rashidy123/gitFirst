public class Task6 {
    public static void main(String[] args) {
        int a=7;
        int count=0;

        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
