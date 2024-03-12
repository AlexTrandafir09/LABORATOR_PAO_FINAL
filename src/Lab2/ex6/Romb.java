package Lab2.ex6;

public class Romb extends Patrulater{
    public int diag1,diag2;
    public Romb(){
        super();
        this.diag1=0;
        this.diag2=0;
    }
    public Romb(int latura1, int latura2,
                double unghi1, double unghi2,int diag1,int diag2){
        super(latura1,latura2,latura1,latura2,unghi1,unghi2,unghi1,unghi2);
        this.diag1=diag1;
        this.diag2=diag2;
    }
    public float arie (){
        return (float) ((diag1*diag2)/2);
    }
}
