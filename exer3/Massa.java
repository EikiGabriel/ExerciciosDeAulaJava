package faculdade_exercicios_java.exer3;

public class Massa {
    private float massaInicial;
    private float massaFinal;
    private int tempo;

    public Massa(float mi) {
        this.massaInicial = mi;
    }



    public void calculaTempo(){
        float calculoMassa = this.getMassaInicial();
        while(true){
            if(calculoMassa < 0.5){
                this.setMassaFinal(calculoMassa);
                return;
            }else{
                calculoMassa = calculoMassa /2;
                this.setTempo(tempo+50);
            }
        }
        
    }


    public float getMassaInicial() {
        return massaInicial;
    }
    public void setMassaInicial(float massaInicial) {
        this.massaInicial = massaInicial;
    }
    public float getMassaFinal() {
        return massaFinal;
    }
    public void setMassaFinal(float massaFinal) {
        this.massaFinal = massaFinal;
    }
    public int getTempo() {
        return tempo;
    }
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }




}
