package atividade2;

import java.util.ArrayList;

public class Calculador<T extends Number> {

    public Calculador() {
    }

    public double media(ArrayList<T> numeros) {
        double soma = 0;

        for (Number n : numeros) {
            double numero = n.doubleValue();
            soma += numero;
        }

        return soma / numeros.size();
    }

    public T moda(ArrayList<T> numeros) {
        int[] cont = new int[numeros.size()];
        int vezes = 0;
        int indice = 0;

        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i; j < numeros.size(); j++) {
                if (numeros.get(i) == numeros.get(j))
                    cont[i] += 1;
            }
        }

        for (int i = 0; i < cont.length; i++) {
            if (cont[i] > vezes) {
                vezes = cont[i];
                indice = i;
            }
        }

        return numeros.get(indice);
    }

    public double mediana(ArrayList<T> numeros) {
        ArrayList<T> copia = (ArrayList<T>)numeros.clone();
        
        copia.sort((o1, o2) -> Double.compare(o1.doubleValue(), o2.doubleValue()));

        if (copia.size() % 2 == 0)
            return (copia.get((copia.size() / 2) - 1).doubleValue() + copia.get(copia.size() / 2).doubleValue()) / 2;
        else
            return copia.get(copia.size() / 2).doubleValue();
    }

    public double variancia(ArrayList<T> numeros) {
        double variancia = 0;

        for (int i = 0; i < numeros.size(); i++) {
            variancia += Math.pow((numeros.get(i).doubleValue() - media(numeros)), 2);
        }

        variancia = variancia / numeros.size();
        
        return variancia;
    }

    public double desvioPadrao(ArrayList<T> numeros) {
        return Math.sqrt(variancia(numeros));
    }

}
