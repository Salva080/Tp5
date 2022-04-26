public class Arreglo {

    public static void sumarLista(int[]array) {
        int sumar = 0;
        for(int i = 0; i < array.length; i++){
            sumar += array[i];
        }
        System.out.println("El promedio de la array: " + (sumar/array.length));
    }

    public static void buscarMayor(int[][]array) {
        int mayor = 0;
        for(int i = 0; i < array.length; i++){
            for(int x = 0; x < array.length; x++){
                if(array[i][x] > mayor){
                    mayor = array [i][x];
                }
            }
        }
        System.out.println("El mayor de la lista: " + mayor);
    }

    public static void cuentaVocales(String string) {
        int Vocales = 0;
        for(int j =  0; j < string.length(); j++){
            if((string.charAt(j) == 'a') || (string.charAt(j) == 'e') || (string.charAt(j) == 'i') || (string.charAt(j) == 'o') || (string.charAt(j) == 'u')){
                Vocales++;
            }
        }
         System.out.println("La cantidad de vocales son: " + Vocales);
    }

    public static void cuentaCaracter(String string, char caracter) {
        int Caracter = 0;
        for(int i = 0; i < string.length(); i++){
            if((string.charAt(i) == caracter)){
                Caracter++;
            }
        }
        System.out.println("Cantidad de caractares " + caracter + " del String es " + Caracter);
    }    
}
