package one.digitalinnovation.personapi.repositories;

import one.digitalinnovation.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository

    //É uma extensão específica de JPA de Repository. Ele contém a API completa de CrudRepository e
    //PagingAndSortingRepository. Portanto, ele contém API para operações CRUD básicas e também API para paginação
    //e classificação.

public interface PersonRepository extends JpaRepository<Person, Long> {
}
