
package Sequence;

//import java.util.Vector;
interface Selector{
    boolean fin();
    int actual();
    void prox();
}

public class Sequence {
    private Dato []items;
    private int next=0;
    public Sequence (Dato []a){
        items=a;
    }
    public void add(Dato x){
        if(next<items.length)
            items[next++]=x;
    }
    public static class Dato{
        private int n;
        public Dato(int v){n=v;}
        public int getdato(){return n;}
    }
    private class SeqSelector implements Selector{
        private int i;
        
        @Override
        public boolean fin(){
            return i == items.length;
        }
        @Override
        public int actual(){
            return items[i].getdato();
        }
        @Override
        public void prox(){
            if(i< items.length) i++;
        }

            
    }
    public Selector selector(){
        return new SeqSelector();
    }
        
    public static void main(String[] args) {
        
     Dato d1=new Dato(1); 
     Dato d2=new Dato(2);
     Dato d[]= new Dato[10];
     d[1]=d1;
     d[2]=d2;
     Sequence s = new Sequence(d);
     SeqSelector sq;
     s.add(d1); 
     s.add(d2);
     s.add(new Dato(1));
     s.add(new Dato(4));
     for (int i = 0; i < s.items.length; i++) { System.out.println("Hola " + s.items[i].n); }
    }
    

}
