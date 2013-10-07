/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rna;

import java.util.Scanner;

/**
 *
 * @author matteus
 */
public class Perceptron {

    int qnt_valor;//variavel que diz a quantidade de atributos da rede
    private Double valores[]; //vetor responsavel por armazenar os valores de cada atributo
    private Double pesos[];//vetor responsavel por armazenar os pesos de cada atributo
    double somatorio = 0;//resultado do somatorio

    //metodo construtor inicializando as variaveis qnt e os vetores de valor e peso
    public Perceptron(int qnt) {
        qnt_valor = qnt;
        this.valores = new Double[qnt_valor + 1]; //o +1 em ambos os vetores é para armazenar o BIAS
        this.pesos = new Double[qnt_valor + 1];
    }

    //metodo para calcular o valor do somatorio de um neuronio
    public void perceptron() {
        //for para percorrer o vetor valores e fazer o somatorio dos valor*peso
        for (int i = 0; i < valores.length; i++) {
            somatorio = somatorio + valores[i] * pesos[i];
        }
        System.out.println("Somatório dos valores: " + somatorio);
    }

    //metodo responsavel por popular os vetores valores e pesos
    public void popula() {
        Scanner in = new Scanner(System.in);
        //for para preencher os vetores, usa-se o +1 na quantidade para poder também preencher o peso do bias
        for (int i = 0; i < qnt_valor + 1; i++) {
            if (i == qnt_valor) { //if posição do vetor for igual ao ultimo valor, esta posição é para o bias
                valores[i] = 1.;//adiciona o valor 1 a posição do bias
                pesos[i] = Math.random();//metodo math.random() atribui um valor aleatorio de 0 a 1 para os pesos
            } else {//se não for, ele le o atributo digitado pelo teclado
                System.out.println("Dê o número do atributo " + i + ": ");
                valores[i] = in.nextDouble();//le o valor aqui
                pesos[i] = Math.random();
            }
        }
        System.out.println("-----------------------------");
        printaVetor();
    }

    //metodo que mostra os vetores apenas para verificação se necessário
    public void printaVetor() {
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
            System.out.println(pesos[i]);
        }
    }

    public void verifica(int somatorio) {
        if (somatorio >= 0) {
            somatorio = 1;
        } else {
            somatorio = 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.println("Dê a quantidade de valores de entrada do Neurônio: ");
            int qnt = in.nextInt();
        for (int i = 1; i <= 2; i++) {
            System.out.println("Classe " + i + ": ");

            //instanciamento da classe perceptron e já passando a quantidade para o metodo construtor
            Perceptron per = new Perceptron(qnt);
            //metodo popula os vetores
            per.popula();
            System.out.println("-----------------------------");
            //calculando o somatorio dos vetores
            per.perceptron();
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        }
    }
}
