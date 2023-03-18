import java.util.HashMap;

/*
Теория
Структура данных - способ расположения элементов в памяти, подразумевающий определенный алгоритм работы со структурой
Стек - структура данных работающая по принципу LIFO(last in first out), т.е. элементы в структуру добавляются на верх стека
и извлекаются с вершины стека
Коллекции - набор классов реализующих основные структуры данных и алгоритмы к ним.
 Для работы со стеками в Java существует класс Stack
 null - пустая ссылка
 */
public class Main {

    public static void main(String[] args) {
     //   Stack<Integer> stack = new Stack<>();   Коллекция для работы со стеком

        Stack stack = new Stack(5);

        stack.stackOut();                  // Вывожу состояние объекта
        stack.arrayOut();

        stack.push(1);

        stack.stackOut();                  // Вывожу состояние объекта
        stack.arrayOut();

        stack.push(12);

        stack.stackOut();                  // Вывожу состояние объекта
        stack.arrayOut();

        System.out.println("Peek: " + stack.peek());

        stack.stackOut();                  // Вывожу состояние объекта
        stack.arrayOut();

        System.out.println("Pop: " + stack.pop());

        stack.stackOut();                  // Вывожу состояние объекта
        stack.arrayOut();

        stack.push(1);

        stack.stackOut();                  // Вывожу состояние объекта
        stack.arrayOut();

        stack.insertIntoPosition(5, 0);

        stack.stackOut();                  // Вывожу состояние объекта
        stack.arrayOut();


        stack.stackOut();                  // Вывожу состояние объекта
        stack.arrayOut();

        HashMap<String, Integer> hashMap  = new HashMap<>();

        stack.push(1);
        stack.push(3);
        stack.push(1);
        stack.push(3);
        stack.push(1);
        stack.push(3);
        stack.push(1);
        stack.push(3);

        stack.stackOut();                  // Вывожу состояние объекта
        stack.arrayOut();

    }
}
