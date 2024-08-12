public class Task8 {
    public static void main(String[] args) {
        int []a={50,60,20,30,80,100};
        int max=a[0],min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(max+" \n"+min);
    }
}
