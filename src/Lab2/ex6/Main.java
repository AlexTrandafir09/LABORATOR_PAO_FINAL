package Lab2.ex6;

public class Main {
    public static void main(String[] args) {
        Patrulater patrulater=new Patrulater(5,6,7,8,90,90,90,90);

        Paralelogram paralelogram=new Paralelogram(5,6,60,30);
        System.out.println(paralelogram.arie());

        Romb romb=new Romb(1,1,60,30,2,1);
        System.out.println(romb.arie());

        Dreptunghi dreptunghi=new Dreptunghi(10,5);
        System.out.println(dreptunghi.arie());

        Patrat patrat=new Patrat(8);
        System.out.println(patrat.arie());
    }

}
