package com.skillbrain.Interfatasisupraincarare;

public class TransformatorNumar implements Transformabil{
    @Override
    public void transforma(String parametru) {

        // Java error handling
        try {
            int numar = Integer.parseInt(parametru);
            System.out.println("Patratul numarului este : " + (numar * numar));
        } catch (Exception parametruIncareStocamErroarea){
            //System.out.println("Input invalid pentru transformare. Trebuie un numar nu : " + e);
            System.out.println(parametruIncareStocamErroarea);
        }
    }
}
