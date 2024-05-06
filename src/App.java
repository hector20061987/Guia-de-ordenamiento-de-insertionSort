public class App {

    //  implemetacion en java (parte 1)- "Método insertionSsort"!
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // selecionamos el elemento a insertar en su posicion correcta 
            int j = i - 1;
            // movemos los elementos que key a una posicion adelante de su posicion
            // actual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // insertamos key en su posicion correcta!
        }


    }

    public static void main(String[] args) throws Exception {
        // implemetacion en java (parte 2)- "Método main"!
        System.out.println("Hello, World!, metodo de ordenamiento de insersion");
        int[] arr = { 12, 11, 13, 5, 6 };

        System.out.println("arreglo original");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        System.out.println();
        System.out.println("----------------------------");
        insertionSort(arr);// llamada al metodo de ordenamiento de insercion

        System.out.println("arreglo ordenado");
        for (int num : arr) {
            System.out.print(num + " ");
            

        }



    }


}

