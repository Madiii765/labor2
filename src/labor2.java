import java.util.Scanner;

public class labor2 {
    public static void main(String[] args) {
        // Подключаем сканер для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Просим ввести координаты
        System.out.print("Введите координату x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите координату y: ");
        double y = scanner.nextDouble();

        // Начинаем проверку
        if (x == 0 && y == 0) {
            // Если оба нуля,то точка в самом центре 0,0 тип
            System.out.println("Точка в начале корд");
        } else if (x == 0) {
            // Если x равен нулю,то точка лежит на вертикальной оси Y
            System.out.println("Точка лежит на оси Y");
        } else if (y == 0) {
            // Если y равен нулю,то точка лежит на горизонтальной оси X
            System.out.println("Точка лежит на оси X");
        } else if (x > 0 && y > 0) {
            // Обе положительные
            System.out.println("Точка находится в 1-й четверти");
        } else if (x < 0 && y > 0) {
            // x отрицательный,y положительный
            System.out.println("Точка находится во 2-й четверти");
        } else if (x < 0 && y < 0) {
            // Обе отрицательные
            System.out.println("Точка находится в 3-й четверти");
        } else {
            // Остается последний:x положительный,y отрицательный
            System.out.println("Точка находится в 4-й четверти");
        }


        scanner.close();
    }
}
