public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();

        // Добавляем учителей
        controller.addTeacher("Иван Иванов", "Математика");
        controller.addTeacher("Мария Петрова", "Русский язык");
        controller.addTeacher("Алексей Сидоров", "Физика");

        // Отображаем список всех учителей
        System.out.println("Список учителей до редактирования:");
        controller.displayAllTeachers();

        // Редактируем второго учителя
        controller.editTeacher(1, "Мария Новикова", "Литература");

        // Отображаем список после редактирования
        System.out.println("\nСписок учителей после редактирования:");
        controller.displayAllTeachers();

        // Отображаем информацию о конкретном учителе
        System.out.println("\nИнформация о втором учителе:");
        controller.displayTeacher(1);
    }
}