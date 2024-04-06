package metier;

import dao.Idao;

public class MetierImpl implements IMetier{
    private Idao dao;

    public void setDao(Idao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp=dao.getdata();
        double res=tmp*12/40;
        return res;
    }
}
