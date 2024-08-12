public class Task1 {
    public static void main(String[] args) {
        int[] temp = {30, 40, 50, 60, 70, 80, 90, 100};
        int high=temp[0];
        int low=temp[0];
        for(int i=0;i<temp.length;i++) {
            if (temp[i]>high) {
                high=temp[i];
            }
            if (temp[i]<low){
                low=temp[i];

            }

        }
        System.out.println(high+"\n "+low);
    }
}
