import java.util.HashMap;
import java.util.Map;

/**
 * @author wentao.jiang
 * @date 2019/9/25 9:08 PM
 * @description
 */
public class Test {
    static class Student {
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("wentao", 26);
        Map<Student, String> map = new HashMap<>();
        map.put(student, "wentao");
        System.out.println(map.get(student));
        student.setName("wentao2");
        System.out.println(map.get(student));
        Student student1 = new Student("wentao", 26);
        System.out.println(map.get(student1));
    }

}
