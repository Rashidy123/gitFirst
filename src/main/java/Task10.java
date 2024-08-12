public class Task10 {
    public static void main(String[] args) {
        String[]d={"me","you","Me","she","her","Me"};
        for(int i=0;i<d.length;i++){
            for(int j=i+1;j<d.length;j++){
                if(d[i]==d[j]){
                    System.out.println(d[i]);
                }
            }
        }
    }
}
