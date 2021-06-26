public class ControleFluxoIfMain {

    public static void main(String[]args) {

        int ano = 2020;

        if ( ano < 0) {
            System.out.println("Não é um ano!");
        } else if ( (ano%4==0 && ano%100!=0) || (ano%400==0) ) {
            System.out.println("É bissexto!");
        } else {
            System.out.println("Não é bissexto!");
        }
    if (10==20) {
        System.out.println("É igual");
    } else {
        System.out.println("Não é igual");
    }
        double altura = 1.6;

        if ( altura < 1.5) {
            System.out.println("Baixinho");
        } else {
            System.out.println("Gigante");
        }
    double salario = 15000.00;

        if (salario >= 15000.00){
            System.out.println("É o Carrion");
        } else {
            System.out.println("Não é o Carrion");
        }


    }

}



// while - Do while -- Faça / Faça enquanto//
//control alt l -- indentação aut//