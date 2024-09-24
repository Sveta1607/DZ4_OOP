public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController() {
        this.teacherService = new TeacherService();
        this.teacherView = new TeacherView();
    }

    // Метод для добавления учителя
    public void addTeacher(String name, String subject) {
        Teacher teacher = new Teacher(name, subject);
        teacherService.addTeacher(teacher);
    }

    // Метод для редактирования учителя
    public void editTeacher(int index, String newName, String newSubject) {
        teacherService.editTeacher(index, newName, newSubject);
    }

    // Метод для отображения всех учителей
    public void displayAllTeachers() {
        teacherView.displayTeachers(teacherService.getAllTeachers());
    }

    // Метод для отображения информации о конкретном учителе
    public void displayTeacher(int index) {
        Teacher teacher = teacherService.getTeacher(index);
        teacherView.displayTeacher(teacher);
    }
}