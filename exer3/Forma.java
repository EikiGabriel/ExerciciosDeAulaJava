package faculdade_exercicios_java.exer3;

public class Forma {
    private float ladoX;
    private float ladoY;
    private float ladoZ;
    
    public Forma(float X, float Y, float Z) {
        this.ladoX = X;
        this.ladoY = Y;
        this.ladoZ = Z;
    }


    public float verificarForma(){
        if(this.getLadoX() < this.getLadoY() + this.getLadoZ() || this.getLadoY() < this.getLadoX() + this.getLadoZ() || this.getLadoZ() < this.getLadoY() + this.getLadoX()){
            System.out.println("A sua forma é um Triangulo!");
            if(this.getLadoX() == this.getLadoY() && this.getLadoX() == this.getLadoZ()){
                System.out.println("E é um Triangulo Equilatero!");
            } else if(this.getLadoX() == this.getLadoY() && this.getLadoX() != this.getLadoZ() || this.getLadoX() == this.getLadoZ() && this.getLadoX() != this.getLadoY() || this.getLadoZ() == this.getLadoY() && this.getLadoX() != this.getLadoZ()){
                System.out.println("E é um Triangulo Isósceles!");
            } else if(this.getLadoX() != this.getLadoY() && this.getLadoX() != this.getLadoZ() && this.getLadoY() != this.getLadoZ()){
                System.out.println("E é um Triangulo Escaleno!");
            }
        }else{
            System.out.println("A sua forma não é um triangulo!");
        }
        return 0;
    }


    public void setLadoX(float ladoX) {
        this.ladoX = ladoX;
    }
    public void setLadoY(float ladoY) {
        this.ladoY = ladoY;
    }
    public void setLadoZ(float ladoZ) {
        this.ladoZ = ladoZ;
    }

    public float getLadoX() {
        return ladoX;
    }
    public float getLadoY() {
        return ladoY;
    }
    public float getLadoZ() {
        return ladoZ;
    }
}
