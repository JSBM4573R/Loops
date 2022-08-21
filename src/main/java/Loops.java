public class Loops {

    public static void main (String[] args) {

        System.out.println(" ----------------------------------- Ciclo For ----------------------------------------- ");

        /*For permite ejecutar un ciclo hasta que su condicion se cumpla.
        Dentro de parentesis se declara un iterador normalmente int en 0 posteriormente separado
        de punto y coma se declara la condicion que se debe cumplir para que el ciclo finalice y
        posteriormente separador de punto y coma, mientras esa condicion no se cumpla aumenta el
        ciclo una vez mas.*/

        int num = 0;
        for (int i = 0; i < 10; i++) {
            num++;
            System.out.println(num);
        }

        System.out.println(" --------------------------------- Ciclos Anexados ------------------------------------- ");

        // Como ejemplo imprimo las tablas de multiplicar del 1 al 10 diez veces.
        // El primer Ciclo recorre una iteracion 10 veces, este va a imprimir la tabla del 1
        for (int i = 1; i <= 10; i++) {
            // Este Ciclo For Anexo va a imprimir la tabla del 1 del 1 al 10
            for (int j = 0; j <= 10; j++) {
                System.out.print(i*j);  //imprime
                System.out.print(" ");
            }
            // Cuando salga del Ciclo Anexo imprimira un salto de Linea.
            System.out.println();   //println imprime salto de linea mientras que print imprime inline
        }


        System.out.println(" ----------------------------------- Ciclo For Each ------------------------------------ ");

        /*For Each es parecido al For sencillo lo unico que cambia es su estructura.
        Dentro de parentesis se declara un iterador como int luego seguido de dos puntos se pone el
        nombre de la lista que quiero iterar. Cada indice de la lista sera guardada en el iterador
        declarado anteriormente, por lo tanto yo puedo inprimir ese iterar y me mostrara el valor de
        cada indice de la lista. */

        int nums[]={1,2,3,4,5};
        int sum=0;
        for (int x: nums) System.out.println(x);


        System.out.println(" ------------------------------------- Ciclo While ------------------------------------- ");

        /*While permite ejecutar un ciclo mientras su condicion entre sus parentesis sea igual a true.*/
        int contador = 0;
        while (contador <= 10) { //mientras que (condicion)
            //Ejecuta el scope
            System.out.println(contador++);
        }
    }
}
