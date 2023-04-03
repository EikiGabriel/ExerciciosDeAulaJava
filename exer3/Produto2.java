package faculdade_exercicios_java.exer3;

public class Produto2 {
    private float pontoX1;
    private float pontoX2;
    private float pontoY1;
    private float pontoY2;


    public Produto2(float pontoX1, float pontoX2, float pontoY1, float pontoY2) {
        this.pontoX1 = pontoX1;
        this.pontoX2 = pontoX2;
        this.pontoY1 = pontoY1;
        this.pontoY2 = pontoY2;
    }


    public float calculaDistancia(){
        float X1 = this.getPontoX1();
        float X2 = this.getPontoX2();
        float Y1 = this.getPontoY1();
        float Y2 = this.getPontoY2();

        float result = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
        return result;
    }
    ///Raiz ((X2 – X1) * (X2 – X1) + (Y2 – Y1) * (Y2 –Y1))

    public float getPontoX1() {
        return pontoX1;
    }
    public void setPontoX1(float pontoX1) {
        this.pontoX1 = pontoX1;
    }
    public float getPontoX2() {
        return pontoX2;
    }
    public void setPontoX2(float pontoX2) {
        this.pontoX2 = pontoX2;
    }
    public float getPontoY1() {
        return pontoY1;
    }
    public void setPontoY1(float pontoY1) {
        this.pontoY1 = pontoY1;
    }
    public float getPontoY2() {
        return pontoY2;
    }
    public void setPontoY2(float pontoY2) {
        this.pontoY2 = pontoY2;
    }



}
