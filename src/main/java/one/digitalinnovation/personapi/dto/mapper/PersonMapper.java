package one.digitalinnovation.personapi.dto.mapper;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/*


    DTO

    Objeto de Transferência de Dados (do inglês, Data transfer object, ou simplesmente DTO), é um padrão de projeto
    de software usado para transferir dados entre subsistemas de um software. DTOs são frequentemente usados em
    conjunção com objetos de acesso a dados para obter dados de um banco de dados.
    A diferença entre objetos de transferência de dados e objetos de negócio ou objetos de acesso a dados é que um DTO
    não possui comportamento algum, exceto o de armazenamento e obtenção de seus próprios dados. DTOs são objetos
    simples que não contêm qualquer lógica de negócio que requeira testes…


 */

/*

    Map Struct

    MapStruct é um gerador de código que simplifica muito a implementação de mapeamentos entre os tipos de bean Java
    com base em uma convenção sobre abordagem de configuração.

    O código de mapeamento gerado usa invocações de método simples e, portanto, é rápido, seguro para tipos e fácil
    de entender.

 */

// Adicionar (componentModel = "spring") a @Mapperanotação informa ao MapStruct que, ao gerar a classe de implementação
// do mapeador, gostaríamos que ela fosse criada com o suporte à injeção de dependência via Spring. Agora, não há
// necessidade de adicionar o campo INSTANCE à interface.

// Uma vez marcado como um @Component, o Spring pode pegá-lo como um bean e você está livre para anotá-lo com @Autowire
// em outra classe.
@Mapper(componentModel = "spring")
public interface PersonMapper {

    //A anotação @Mapping permite definirmos qual atributo da classe será mapeado para outro com nome diferente ou
    //tipo diferente.
    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
