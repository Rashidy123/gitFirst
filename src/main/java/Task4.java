public class Task4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4, 5, 6,15},
                {8, 9, 10, 11, 12, 13},
        };
        int odd = 0;
        int even=0;
        for (int i = 0; i <numbers.length; i++) {
            for (int j= 0; j< numbers[i].length; j++) {
                if (numbers[i][j] % 2==0) {
                    even+=numbers[i][j];
                }else{
                    odd+=numbers[i][j];
                }
            }
        }
        System.out.println(even);
        System.out.println(odd);

    }
}
