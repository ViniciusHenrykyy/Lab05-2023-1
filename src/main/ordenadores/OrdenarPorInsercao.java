package ordenadores;
public class OrdenarPorInsercao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {    
        for (int i = 1; i < array.length; i++) {
            int contador = array[i];
            int j = 0;
            for ( j = i; j > 0; j--) {
                if(array[j-1] > contador){
                    array[j] = array[j-1];
                }else{
                    break;
                }
            }
            array[j] = contador;            
        }
        return array;
    }
    
}
