package ordenadores;

public class OrdenarPorSelecao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int menor = array[i];
            int posicaoMenor = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] < menor){
                    menor = array[j];
                    posicaoMenor = j;
                }
            }
            array[posicaoMenor] = array[i];
            array[i] = menor;
        }
        
        return array;
    }
    
}
