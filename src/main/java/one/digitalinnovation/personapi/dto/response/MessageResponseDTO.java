package one.digitalinnovation.personapi.dto.response;

import lombok.Builder;
import lombok.Data;

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

    Lombok = O Lombok é um framework para Java que permite escrever código eliminando a verbosidade,
    o que permite ganhar tempo de desenvolvimento para o que realmente é importante. Seu uso permite gerar
    em tempo de compilação os métodos getters e setters, métodos construtores, padrão builder e muito mais.

*/

//@Data = @Data é uma anotação que gera o código padronizado para classes Java: getters para todos os campos,
//setters para todos os campos não-finais e o toString apropriado, equals e implementações hashCode
//que envolvem os campos da classe.

//@Builder = Builder é um padrão de projeto de software criacional que permite a separação da construção de
//um objeto complexo da sua representação, de forma que o mesmo processo de construção possa criar diferentes representações.

@Data
@Builder
public class MessageResponseDTO {

    private String message;
}
