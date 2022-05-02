public class Any {
    long any;

    public Any(long n){
        any=n;
    }

    public int digitsDiferents(){
        int digitsDif=0;
        int[] contador = new int[10];
        long aux=any;
        while (aux>0){
            long modul=aux%10;
            contador[(int) modul]++;
            aux/=10;
        }
        for (int i = 0; i < 10; i++) {
            if(contador[i]!=0) digitsDif++;
        }
        return digitsDif;
    }
}
