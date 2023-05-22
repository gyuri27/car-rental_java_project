package com.example.car.rental.data.repo;

import java.util.List;
import java.util.Optional;

/**
 * Itt hozzuk léter az interfacet a metódusoknak.
 *
 * @param <T> Ez a listának a paramétere.
 * @param <I> Ez az indexe a kocsinak.
 */
public interface Repo<T, I> {

T save(T item);

Optional<T> getById(I id);

List<T> getAll();

T update(T item);

void deleteById(I id);
}
