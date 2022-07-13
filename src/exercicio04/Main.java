package exercicio04;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale localeBR = new Locale("pt", "BR");
        NumberFormat moeda = NumberFormat.getCurrencyInstance(localeBR);
        NumberFormat percentual = NumberFormat.getPercentInstance(localeBR);

        List<Listas> listas = new ArrayList<>();
        listas.add(new Listas("SP", 67836.43));
        listas.add(new Listas("RJ", 36678.66));
        listas.add(new Listas("MG", 29229.88));
        listas.add(new Listas("ES", 27165.48));
        listas.add(new Listas("Outros", 19849.53));

        double soma = 0;

        for (Listas valor : listas) {
            soma += valor.getValor();
        }


        for (Listas percent : listas) {
            System.out.println(percent.getEstados() + " - " + moeda.format(percent.getValor()) + " = " + percentual.format(percent.getValor() / soma));
        }
        System.out.println("Valor total da soma: " + moeda.format(soma));
    }

}
