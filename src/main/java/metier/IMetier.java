package metier;

import java.util.List;

public interface IMetier <T> {
    void add(T o);
    List<T>getAll();
    T findbyId(long id);
    void delete(long id);
}
