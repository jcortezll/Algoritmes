public class Hyperpar {
    long num;
    public Hyperpar(long n){
        num=n;
    }
    public boolean esHyperpar(){
        long aux=num;
        while (aux>0){
            long modul=aux%10;
            if(modul%2!=0) return false;
            aux/=10;
        }
        return true;
    }
}
