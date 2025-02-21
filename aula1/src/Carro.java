import javax.swing.*;

public class Carro {
    //variaveis
    //tipo de dados primitivos, para dados primitivos se comeca com letra minuscula
    public int ano;
    public float velocidade;
    //tipo de dado é uma classe, para criar a classe usamos maiusculo
    public String marca, modelo;
    // metodos construtores
    //sem parametros
    public Carro(){
        this.marca = "Vazia";
        this.modelo = "Vazio";
    }
    public Carro (int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    };
    //metodos
    public void exibirDetalhes(){
        //this representa um objeto que chama metodo
        // System.out.println mostra no console
        //JOptionPane.showMessageDialog(null, mostra em um popup
        for (int i = 0; i != 10 ; i++) {
            JOptionPane.showMessageDialog(null,"eh o meu prefeito");
        }

        JOptionPane.showMessageDialog(null," Modelo: " + this.modelo + " Marca: " + this.marca + " Ano: " + this.ano + " Velocidade: " + this.velocidade);
    }
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }

    public void frear(float x){
        if(this.velocidade >= x){
            this.velocidade -= x;
        }
        else{
            this.velocidade = 0.0f;
        }
    }
}
