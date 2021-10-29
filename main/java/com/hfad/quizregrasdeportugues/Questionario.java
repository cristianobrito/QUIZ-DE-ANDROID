package com.hfad.quizregrasdeportugues;

public class Questionario {
    private String mQuestoes [] = {
            "1. QUAL LETRA É SEMPRE VOGAL?",
            "2. QUAIS LETRAS SÃO SEMPRE SEMIVOGAIS?",
            "3. AS LETRAS M/N COM SOM DE I/U SÃO?",
            "4. AS LETRAS E/O COM SOM DE I/U SÃO?",
            "5. QUANTAS VOGAIS PODEM HAVER EM CADA SÍLABA?",
            "6. ENTRE A LETRA I - U A PRIMEIRA QUE VIER NA SÍLABA É?",
            "7. TODA LETRA U SEGUIDA PELA LETRA A________ .",
            "8. SÃO SEMPRE DÍGRAFOS?",
            "9. A LETRA I ENTRE DUAS VOGAIS NÃO É?",
            "10.I-U COM ACENTO SÃO HIATO DESDE QUE ANTECEDIDOS DE________ .?"

    };

    private String mEscolhas[][] = {
            {"a letra (A)", "a letra (E)", "a letra (O)", "a letra (U)"},
            {"A - E", "I - U", "O - E", "A - O"},
            {"VOGAIS", "SEMIVOGAIS", "DITONGOS", "HIATOS"},
            {"DITONGOS", "VOGAIS", "SEMIVOGAIS", "HIATOS"},
            {"1 VOGAL", "2 VOGAIS", "1 SEMIVOGAL", "3 VOGAIS"},
            {"VOGAL", "SEMIVOGAL", "HIATO", "DITONGO"},
            {"É DITONGO", "SEPARA-SE", "É SEMIVOGAL", "É VOGAL"},
            {"LH-CH-LL", "LH-CH-NH", "RR-SS-CH", "NH-LL-SS"},
            {"DITONGO", "VOGAL", "TRITONGO", "HIATO"},
            {"VOGAL", "SEMIVOGAL", "DA LETRA I", "CONSOANTE"},
    };

    private String mAcertos[] = {
            "a letra (A)",
            "I - U",
            "SEMIVOGAIS",
            "SEMIVOGAIS",
            "1 VOGAL",
            "VOGAL",
            "SEPARA-SE",
            "LH-CH-NH",
            "TRITONGO",
            "VOGAL"
    };

    private String mDicas[]   = {"DICA: 1", "DICA: 2", "DICA: 3"};

    public String getQuestoes(int a) {
        String questao = mQuestoes[a];
        return questao;
    }

    public String getEscolha1(int a) {
        String escolha0 = mEscolhas[a][0];
        return escolha0;
    }

    public String getEscolha2(int a) {
        String escolha1 = mEscolhas[a][1];
        return escolha1;
    }

    public String getEscolha3(int a) {
        String escolha2 = mEscolhas[a][2];
        return escolha2;
    }
    public String getEscolha4(int a) {
        String escolha3 = mEscolhas[a][3];
        return escolha3;
    }
    public String getEscolha5(int a) {
        String escolha4 = mEscolhas[a][0];
        return escolha4;
    }
    public String getEscolha6(int a) {
        String escolha5 = mEscolhas[a][4];
        return escolha5;
    }
    public String getEscolha7(int a) {
        String escolha6 = mEscolhas[a][4];
        return escolha6;
    }
    public String getEscolha8(int a) {
        String escolha7 = mEscolhas[a][4];
        return escolha7;
    }
    public String getEscolha9(int a) {
        String escolha8 = mEscolhas[a][4];
        return escolha8;
    }
    public String getEscolha10(int a) {
        String escolha9 = mEscolhas[a][4];
        return escolha9;
    }

    public String getAcerto(int a) {
        String acerto = mAcertos[a];
        return acerto;
    }

    public String getDicas(int a) {
        String dica = mDicas[a];
        return dica;
    }
}
