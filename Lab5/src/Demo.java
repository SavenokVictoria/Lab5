public class Demo {
    // Метод сортування масиву за допомогою алгоритму сортування вибором
    public static void selectionSort(long[] arr) {
        int n = arr.length;

        // Проходимо через всі елементи масиву
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Вважаємо, що мінімум знаходиться на поточній позиції

            // Шукаємо мінімальний елемент у решті масиву
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Оновлюємо індекс мінімуму
                }
            }

            // Обмінюємо місцями елементи
            long temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Метод main для запуску програми
    public static void main(String[] args) {
        // Приклад масиву для сортування
        long[] arr = {64, 34, 25, 12, 22, 11, 90};

        // Викликаємо метод сортування
        selectionSort(arr);

        // Виводимо відсортований масив
        System.out.println("Відсортований масив:");
        for (long num : arr) {
            System.out.print(num + " ");
        }
    }
}

