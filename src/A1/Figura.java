package A1;

public class Figura implements Rysowanie {
    @Override
    public void rysuj2D(String rys) {
        System.out.println("to jest rysowanie w 2D" + rys);
    }

    @Override
    public void rysuj3D(String rys1, String rys2) {
        System.out.println("To jest rysowanie w 3D" + rys1 + rys2);
    }
}
