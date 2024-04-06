package presentation;

import dao.Idao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        Idao dao=(Idao)cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier)cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",Idao.class);
        method.invoke(metier,dao);

        System.out.println("resultats = "+metier.calcul());

    }
}
