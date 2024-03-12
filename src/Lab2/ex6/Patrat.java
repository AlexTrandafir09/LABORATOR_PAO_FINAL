package Lab2.ex6;

public class Patrat extends Dreptunghi{
    public Patrat(int latura1){
        super(latura1,latura1);
    }
    @Override
    public float arie(){
        return (float) latura1*latura1;
    }

}
