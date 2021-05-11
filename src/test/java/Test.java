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
        System.out.println(1 ^ 2);
    }

}
