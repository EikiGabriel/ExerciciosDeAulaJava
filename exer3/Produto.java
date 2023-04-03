package faculdade_exercicios_java.exer3;

import java.sql.SQLOutput;

public class Produto {
    
    private int codigo;
    private int quantidade;
    private double valorÚnitario;
    private int pagameto;


    public Produto(int c, int q, double vu, int p) {
        this.codigo = c;
        this.quantidade = q;
        this.valorÚnitario = vu;
        this.pagameto = p;
    }

    public double calcularDesconto(){
        double valor=0;
        if(this.getPagameto() == 1){
            valor = (getValorÚnitario() * getQuantidade()) * 0.9;
            System.out.println("Você ira receber um desconto de R$"+ getValorÚnitario() * getQuantidade() * 0.1);
            return valor;
        }
        else if(this.getPagameto() == 4 || this.getPagameto() == 3){
            valor = (getValorÚnitario() * getQuantidade()) * 0.95;
            System.out.println("Você ira receber um desconto de R$" + getValorÚnitario() * getQuantidade() * 0.05);
            return valor;
        }
        else if(this.getPagameto() == 2){
            valor = (getValorÚnitario() * getQuantidade()) * 0.98;
            System.out.println("Você ira receber um desconto de R$"+ getValorÚnitario() * getQuantidade() * 0.02);
            return valor;
        }
        else{
            System.out.println("Forma de pagamento invalida!");
            return 0;
        }
    }

    public double valorFinal(double v){
        System.out.println("Valor a pagar R$" + v);
        return 0;
    }

    
    public void setCodigo(int c) {
        this.codigo = c;
    }
    public void setQuantidade(int q) {
        this.quantidade = q;
    }
    public void setValorÚnitario(double vu) {
        this.valorÚnitario = vu;
    }
    public void setPagameto(int p) {
        this.pagameto = p;
    }

    public int getCodigo() {
        return codigo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getValorÚnitario() {
        return valorÚnitario;
    }
    public int getPagameto() {
        return pagameto;
    }
        
}
