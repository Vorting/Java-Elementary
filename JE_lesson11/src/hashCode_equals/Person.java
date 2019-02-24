package hashCode_equals;

import java.util.Objects;

public class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        if (id != person.id) {
            return false;
        }
        return name != null ? name.equals(person.name) : person.name == null;
    }

    // {object} ->
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    /*
    Контракт hashCode() equals()
    1) У двух проверяемых обьектов вызываем метод hashCode()
    если хэши разные -> два обьекта точно разные.

    2)(коллизия) если хэши одинаковые -> вызываем метод equals() (медленный, но точный)
    3)equals() -> выдает ответ

     */
}

