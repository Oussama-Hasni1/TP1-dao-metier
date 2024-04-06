package dao;

public class IdaoImpl implements Idao{
    @Override
    public double getdata() {
        System.out.println("version base de données");
        double temp=Math.random()*40;
        return temp;
    }
}
