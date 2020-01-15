package B2;

public class MojaKlasa implements PierwszyInterfejs, DrugiInterfejs { //musimy wtedy zaimplementować metodę f z drugiego interfejsu lub zmienic nazwe metody w drugim interfejsie
    public void f(int a) {
        System.out.println("f" + a);
    }
    public void f(double b){
        System.out.println("f" + b);
    }
}
