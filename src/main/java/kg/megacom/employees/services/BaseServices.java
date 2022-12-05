package kg.megacom.employees.services;

import java.util.ArrayList;
import java.util.List;

public interface BaseServices <T>{
    T save(T t);
    T findById(Long id);
    List<T> findAll();

}
