public class DijeljenjeBroja {

    public static void main(String[] args) {
        int suma = 0;

        for(int i = 0; i <= 100; i++){
            if(i % 3 == 0){
                suma = suma + i;
            }
        }

        System.out.println("Suma je: " + suma);
    }

}
