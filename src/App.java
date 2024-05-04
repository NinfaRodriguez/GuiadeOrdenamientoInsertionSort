public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Metodo de insercion");

        int[] arr = { 12, 11, 13, 5, 6 };

        System.out.println("Arreglo Original:");
        for (int num : arr){
            System.out.println(num + " ");
        }

        System.out.println();

        System.out.println("================================");
        insertionSort(arr); //Llamada al método de ordenamiento por inseción

        System.out.println("Arreglo ordenado:");
        for (int num : arr){
            System.out.println(num + " ");
        }


    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i]; //seleccionamos un elemento a insertar en su posición correcta
            int j = i - 1;
            //Movemos los elementos mayores que key a una posición adelante de su posición
            while (j >=0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; //Insertamos key en su posición corecta
        }
    }
}
