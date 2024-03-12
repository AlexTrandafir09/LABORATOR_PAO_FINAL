package Lab2.ex6;

public class Dreptunghi extends Paralelogram{
    public Dreptunghi(){
        super();
    }
    public Dreptunghi(int latura1, int latura2){
        super(latura1,latura2,90,90);
    }

    public float arie(){
        return (float) (latura1*latura2);
    }

}
