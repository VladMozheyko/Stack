/*
Базовые операции стека
Push - добавить элемент в стек на вершину
Pop - вернуть верхний элемент и удалить его
Peek - просто показать последний элемент
 */
public class Stack {                // Класс для работы со стеком
    private Object[] arr;
    private int count;

    public Stack(int size) {        // Выделяем начальную память для стека
        arr = new Object[size];     // Создаем массив для хранения элементов
        count = 0;                  // Устанавливаем счетчик на 0
    }

    /**
     * Метод для добавления элемента в вершину стека
     * @param value добавляемое значение
     */
    public void push(Object value){
        if(0.8*arr.length < count){  // Проверяем достаточно ди памяти, если нет, выделяем дополнительную
            addMemory();
        }
        arr[count] = value;
        count++;
    }

    /**
     * Метод для выделения дополнительной памяти
     */
    private void addMemory() {
        Object[] temp = arr;                // Запоминаем старые элементы
        arr = new Object[2*arr.length];     // Создаем более крупный массив
        copyArray(temp);                    // Копируем старый массив  в новый
    }

    /**
     * Метод для записи значений старого массива в новый
     * @param temp старый массив
     */
    private void copyArray(Object[] temp) {
        for (int i = 0; i < temp.length; i++) {   // Сама запись старых элементов в новый массив
             arr[i] = temp[i];
        }
    }

    /**
     * Возвращает и удаляет последний элемент
     * @return последний элемент или - 1, если стек пустой
     */
    public Object pop(){
        if(count <= 0){
            System.out.println("Стек пустой");
            return -1;
        }
        return arr[--count];
    }

    /**
     * Метод возвращает вершину стека
     * @return последний элемент или - 1, если стек пустой
     */
    public Object peek(){
        if(count <= 0){
            System.out.println("Стек пустой");
            return -1;
        }
        int size = count -1;
        return arr[size];
    }

    /**
     * Метод для вывода стека
     */
    public void stackOut(){
        System.out.println("Стек: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Метод для вывода всей выделенной памяти
     */
    public void arrayOut(){
        System.out.println("Массив(выделенная память): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Метод для добавления в произвольную область стека
     * @param value
     * @param pos
     */
    public void insertIntoPosition(Object value, int pos){             // Реализация более продвинутой версии стека
        for (int i = count; i > pos ; i--) {                           // Далем сдвиг элементов для освобождения позиции
            arr[i] = arr[i-1];
        }
        arr[pos] = value;                                              // Присваиваем элемент освобожденной позиции
        count++;                                                       // Увеличиваем счетчик добавленных элементов
    }

}
