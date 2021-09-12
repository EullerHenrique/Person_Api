package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

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

// @AllArgsConstructor = essa anotação é responsável por gerar um construtor com um parâmetro para cada atributo de sua classe.

//@NoArgsConstructor = essa anotação é responsável por gerar um construtor sem parâmetros,
//vale ressaltar que se tiver campos final na sua classe deverá usar um atributo force = true em sua anotação.

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    //@NotNull: um CharSequence , Collection , Map ou Array restrito é válido desde que não seja nulo, mas pode estar vazio.
    //@NotEmpty: um CharSequence , Collection , Map ou Array restrito é válido desde que não seja nulo e
    //seu tamanho / comprimento seja maior que zero.
    //@NotBlank: uma String restrita é válida desde que não seja nula e o comprimento após o trim() seja maior que zero.
    //@Size: Define o valor minímo e o valor máximo que o atributo pode receber

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    //@NotNull: um CharSequence , Collection , Map ou Array restrito é válido desde que não seja nulo, mas pode estar vazio.
    //@NotEmpty: um CharSequence , Collection , Map ou Array restrito é válido desde que não seja nulo e
    //seu tamanho / comprimento seja maior que zero.
    //@NotBlank: uma String restrita é válida desde que não seja nula e o comprimento após o trim() seja maior que zero.
    //@Size: Define o valor minímo e o valor máximo que o atributo pode receber

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    //@NotNull: um CharSequence , Collection , Map ou Array restrito é válido desde que não seja nulo, mas pode estar vazio.
    //@NotEmpty: um CharSequence , Collection , Map ou Array restrito é válido desde que não seja nulo e
    //seu tamanho / comprimento seja maior que zero.
    //@NotBlank: uma String restrita é válida desde que não seja nula e o comprimento após o trim() seja maior que zero.
    //@CPF: Verifica se o CPF é válido

    @NotEmpty
    @CPF
    private String cpf;

    //@NotNull: um CharSequence , Collection , Map ou Array restrito é válido desde que não seja nulo, mas pode estar vazio.
    //@NotEmpty: um CharSequence , Collection , Map ou Array restrito é válido desde que não seja nulo e
    //seu tamanho / comprimento seja maior que zero.
    //@NotBlank: uma String restrita é válida desde que não seja nula e o comprimento após o trim() seja maior que zero.

    @NotNull
    private String birthDate;

    //@Valid: valida o campo com base nas restrições impostas no PhoneDTO
    //@NotNull: um CharSequence , Collection , Map ou Array restrito é válido desde que não seja nulo, mas pode estar vazio.
    //@NotEmpty: um CharSequence , Collection , Map ou Array restrito é válido desde que não seja nulo e
    //seu tamanho / comprimento seja maior que zero.
    //@NotBlank: uma String restrita é válida desde que não seja nula e o comprimento após o trim() seja maior que zero.

    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;
}
