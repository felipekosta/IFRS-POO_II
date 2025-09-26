package edu.ifsc.testesoftware.testes;

public class Voto {

    public static void main(String[] args) {
        
        int[] tabela = {
            15, // idade < 16: não vota, nativo ou estrangeiro
            17, // idade < 18: facultativo nativo, estrangeiro não vota
            34, // idade 18-70: obrigatório nativo, estrangeiro não vota
            75 // idade > 70: facultativo nativo, estrangeiro não vota
        };
        for (int is : tabela) {
            System.out.println("Voto nativo: " + verificaVoto(is, true));
        }
        for (int is : tabela) {
            System.out.println("Voto gringo: " + verificaVoto(is, false));
        }
    
        for (int is : tabela) {
            System.out.println("Voto nativo: " + verificaVoto2(is, true));
        }
        for (int is : tabela) {
            System.out.println("Voto gringo: " + verificaVoto2(is, false));
        }
    }

    
    public static int verificaVoto2(int idade, boolean nativo) {
        int[][] tabelaDecisao = {
            {0, 0}, // idade < 16: não vota, nativo ou estrangeiro
            {2, 3}, // idade < 18: facultativo nativo, estrangeiro não vota
            {1, 3}, // idade 18-70: obrigatório nativo, estrangeiro não vota
            {2, 3} // idade > 70: facultativo nativo, estrangeiro não vota
        };
        int faixaIdade = (idade < 16) ? 0 : (idade < 18 ? 1 : (idade <= 70 ? 2 : 3));
        int indiceNativo = nativo ? 0 : 1;
        return tabelaDecisao[faixaIdade][indiceNativo];
    }

        public static int verificaVoto(int idade, boolean nativo) {
        int[] tabelaDecisao = {
            0, // idade < 16: não vota, nativo ou estrangeiro
            2, // idade < 18: facultativo nativo, estrangeiro não vota
            1, // idade 18-70: obrigatório nativo, estrangeiro não vota
            2, // idade > 70: facultativo nativo, estrangeiro não vota
            3 // idade > 70: facultativo nativo, estrangeiro não vota
        };
        int faixaIdade = (idade < 16) ? 0 : (idade < 18 ? 1 : (idade <= 70 ? 2 : 3));
        faixaIdade = nativo ? faixaIdade : 4;
        return tabelaDecisao[faixaIdade];
    }

}
