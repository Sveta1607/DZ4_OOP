import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    // Метод для добавления учителя
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Метод для получения списка всех учителей
    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    // Метод для редактирования учителя
    public void editTeacher(int index, String newName, String newSubject) {
        if (index >= 0 && index < teachers.size()) {
            Teacher teacher = teachers.get(index);
            teacher.setName(newName);
            teacher.setSubject(newSubject);
        }
    }

    // Метод для получения учителя по индексу
    public Teacher getTeacher(int index) {
        if (index >= 0 && index < teachers.size()) {
            return teachers.get(index);
        }
        return null;
    }
}