package ext;

import dao.Idao;

public class IdaoImpl2 implements Idao {
    @Override
    public double getdata() {
        System.out.println("version capteur");
        double tmp = 42;
        return tmp;
    }
}
