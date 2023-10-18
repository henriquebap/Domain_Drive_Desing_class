package aula_factory;

public class PoligonoFactory {
    
    public static Poligono getPoligono(int numLados){
        if(numLados == 3){
            return new Triangulo();
        }else if(numLados == 4){
            return new Quadrado();
        }else if(numLados == 5){
            return new Pentagono();
        }
        return null;
    }

}
