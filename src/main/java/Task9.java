public class Task9 {
    public static void main(String[] args) {
        int []a={10,20,30,100,1000,4000};
        int fir=a[0];
        int sec=a[0];

        for(int i=0;i<a.length;i++) {
            if (a[i] > fir) {
                sec = fir;
                fir = a[i];

            } else if (a[i] > sec && a[i] < fir) {
                sec = a[i];
            }
        }
        System.out.println(sec);
    }
}
