package br.senaigo.mobile.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.senaigo.mobile.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
