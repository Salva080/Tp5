public class PruebaArreglo {

    public static void main(String[] args) {
        
        //ARREGLO UNIDIMENSIONAL DE ENTEROS
        int ListaA[] = new int [5];
        //ARREGLO BIDIMENSIONAL E INRREGULAR DE ENTEROS QUE DEVUELVE EL ENTERO MAS GRANDE
        int ListaB[][] ={{15,20,10},
                        {75,145,95},
                        {60,1,35}};
        
        ListaA[0] = 1;
        ListaA[1] = 2;
        ListaA[2] = 3;
        ListaA[3] = 4;
        ListaA[4] = 5;
        
        Arreglo lista = new Arreglo();
        
        
        Arreglo.sumarLista(ListaA);
        Arreglo.buscarMayor(ListaB);
        Arreglo.cuentaCaracter("Tecnicatura",'c');
        Arreglo.cuentaVocales("Tecnicatura Desarrolador De Software");
    }
}
