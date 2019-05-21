package ac.za.cput.repository;

public interface IRepository <T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID personId);
    T read(ID personId);
}
