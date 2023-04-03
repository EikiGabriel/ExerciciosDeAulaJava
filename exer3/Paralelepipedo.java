package faculdade_exercicios_java.exer3;


public class Paralelepipedo {
    private float ladoA;
    private float ladoB;
    private float ladoC;

    public Paralelepipedo(float A, float B, float C) {
        this.ladoA = A;
        this.ladoB = B;
        this.ladoC = C;
    }

    public float calculaDiagonal(){
        float L = (float)Math.sqrt(this.getLadoA() * this.getLadoA() + this.getLadoB() * this.getLadoB());
        float D =  (float)Math.sqrt(L*L + this.getLadoC() * this.getLadoC());
        return D;
    }

    public float getLadoA() {
        return ladoA;
    }
    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }
    public float getLadoB() {
        return ladoB;
    }
    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }
    public float getLadoC() {
        return ladoC;
    }
    public void setLadoC(float ladoC) {
        this.ladoC = ladoC;
    }


}
