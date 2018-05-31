public class LiczbyParzyste {
    public static void main(String[] args){
        int suma=0;
        for(int i=0; i<101;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
            suma+=i;
        }
        System.out.println("Suma liczb to " + suma);
    }
}
