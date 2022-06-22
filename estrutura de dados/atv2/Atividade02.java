import java.util.Arrays;
import java.util.Random;

public class Atividade02 {

    public static void main(String[] args) {

        Random aleatorios = new Random();
        int chave;
        long tempoIniSequencial, tempoIniBinario, tempoSeq, tempoBi;

        int [] vetor = new int [10];       //cria vetor

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = aleatorios.nextInt(20);  //sorteia números para o vetor
        }

        chave = aleatorios.nextInt(20);   //posiciona um número aleatorio em um lugar aleatório

        tempoIniSequencial = System.currentTimeMillis();        //conta tempo inicial da sequencial
        buscaSequencial(vetor, chave);                          //função para buscar a chave dentro do vetor
        tempoSeq = System.currentTimeMillis() - tempoIniSequencial;

        tempoIniBinario = System.currentTimeMillis();
        buscaBinaria(vetor, chave);                             //função em busca binária
        tempoBi = System.currentTimeMillis() - tempoIniBinario;

        System.out.println("Tempo de busca no método sequencial: " + tempoSeq);
        System.out.println("Tempo de busca no método binário: " + tempoBi);

    }
    public static void buscaSequencial(int[] vetor, int chave) {        //função da busca sequencial

        Arrays.sort(vetor);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                break;
            }
        }
    }

    public static void buscaBinaria(int[] vetor, int chave) {       //função de busca binária

        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        Arrays.sort(vetor);

        while (fim >= inicio) {

            meio = (inicio + fim) / 2;      //divisão para busca

            if (vetor[meio] < chave) {
                inicio = meio + 1;

            } else if (vetor[meio] > chave) {
                fim = meio - 1;

            } else {
                break;
            }
        }
    }
}



        