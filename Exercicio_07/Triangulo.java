package Exercicio_07;

public class Triangulo {
    private float face1, face2, face3;
    
    public Triangulo (float face1, float face2) {
        this.face1 = face1;
        this.face2 = face2;
    }
    
    public void calcHipo() {
        face3 =  (float) Math.sqrt(face1*face1 + face2*face2);
    }
    
    public float getFace1() {
        return face1;
    }
    
    public float getFace2() {
        return face2;
    }
    
    public float getFace3() {
        return face3;
    }
}