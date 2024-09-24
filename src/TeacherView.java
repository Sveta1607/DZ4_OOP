import java.util.List;

public class TeacherView {
    // Метод для отображения списка учителей
    public void displayTeachers(List<Teacher> teachers) {
        if (teachers.isEmpty()) {
            System.out.println("В системе нет учителей.");
        } else {
            for (int i = 0; i < teachers.size(); i++) {
                System.out.println((i + 1) + ". " + teachers.get(i));
            }
        }
    }

    // Метод для отображения информации о конкретном учителе
    public void displayTeacher(Teacher teacher) {
        if (teacher != null) {
            System.out.println("Информация об учителе: " + teacher);
        } else {
            System.out.println("Учитель не найден.");
        }
    }
}