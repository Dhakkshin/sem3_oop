public class loopsAndJumps {
    public static void main(String[] args){
        for(int i = 1; i <= 2; i++){
            for (int j = 0; j <= 3; j++){
                if (j == 2) break;
                System.out.println(j);
            }
        }
    }
}