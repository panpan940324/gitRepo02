/**
 * @className: Person
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/9/12 22:39
 * @version: 1.0
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
