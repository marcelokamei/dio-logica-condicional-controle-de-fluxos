package OperadoresLogicos;

public class OperadoresLogicos {

    /*

    CONJUNÇÃO
    operação lógica que só é verdadeira quando os operandos ou
    expressões envolvidas são verdadeiras.
    Simbologia: &&
    Terminologia: and

    DISJUNÇÃO
    operação que só é falsa quando ambos os operandos
    ou expressoes são falsos.
    Simbologia: ||
    Terminiologia: or

    DISJUNÇÃO EXCLUSIVA
    operação que só é verdade quando os operandos ou
    expressões são opostos
    Simbologia: ^
    Terminologia: xor

    NEGAÇÃO
    operação que inverte o valor lógico de um operando ou expressão
    Simbologia: !
    Terminologia: inversão

     */

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 "+(b1 && b2));
        System.out.println("b1 && b3 "+(b1 && b3));

        System.out.println("b2 || b3 "+(b2 || b3));
        System.out.println("b2 || b4 "+(b2 || b4));

        System.out.println("b1 ^ b3 "+(b1 ^b3));
        System.out.println("b4 ^ b1 "+(b4 ^b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 + i2) < (f2 - f1)) && true "+ (((i1 + i2) < (f2 - f1)) && true));

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        double salarioMensal = 11893.55d;
        double mediaSalario = 10500d;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe Auxílio: " + recebeAuxilio);
    }

}
