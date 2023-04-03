package faculdade_exercicios_java.exer3;

public class Amostra {
    private int codigoAmostra;
    private int conteudoCarbono;
    private int durezaRokwell;
    private int resistenciaTracao;

    public Amostra(int ca, int cc, int d, int r) {
        this.codigoAmostra = ca;
        this.conteudoCarbono = cc;
        this.durezaRokwell = d;
        this.resistenciaTracao = r;
    }


    public int informaGrau(){
        int test1=0, test2=0, test3=0;
        if(this.getConteudoCarbono() <= 7){
           test1++;
        }if(this.getDurezaRokwell() > 50){
            test2++;
        }if(this.getResistenciaTracao() > 80){
            test3++;
        }if(test1 == 1 && test2 == 1 && test3 == 1){
            return 10;
        }if(test1 == 1 && test2 == 1 && test3 == 0){
            return 9;
        }if(test1 == 1 && test2 == 0 && test3 == 0){
            return 8;
        }if(test1 == 1 && test2 == 0 && test3 == 1 || test1 == 1 && test2 == 1 && test3 == 0 || test1 == 0 && test2 == 1 && test3 == 1 || test1 == 0 && test2 == 1 && test3 == 0 || test1 == 0 && test2 == 0 && test3 == 1 || test1 == 0 && test2 == 0 && test3 == 0 ){
            return 7;
        }
        System.out.println("Erro ao analisar");
        return 0;
    }
 

    public int getCodigoAmostra() {
        return codigoAmostra;
    }
    public void setCodigoAmostra(int codigoAmostra) {
        this.codigoAmostra = codigoAmostra;
    }
    public int getConteudoCarbono() {
        return conteudoCarbono;
    }
    public void setConteudoCarbono(int conteudoCarbono) {
        this.conteudoCarbono = conteudoCarbono;
    }
    public int getDurezaRokwell() {
        return durezaRokwell;
    }
    public void setDurezaRokwell(int durezaRokwell) {
        this.durezaRokwell = durezaRokwell;
    }
    public int getResistenciaTracao() {
        return resistenciaTracao;
    }
    public void setResistenciaTracao(int resistenciaTracao) {
        this.resistenciaTracao = resistenciaTracao;
    }

}
