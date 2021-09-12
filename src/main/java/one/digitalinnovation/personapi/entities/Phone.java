package one.digitalinnovation.personapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*

    Lombok = O Lombok é um framework para Java que permite escrever código eliminando a verbosidade,
    o que permite ganhar tempo de desenvolvimento para o que realmente é importante. Seu uso permite gerar
    em tempo de compilação os métodos getters e setters, métodos construtores, padrão builder e muito mais.

*/

//@Entity = A anotação @Entity é utilizada para informar que uma classe também é uma entidade.
//A partir disso, a JPA estabelecerá a ligação entre a entidade e uma tabela de mesmo nome no banco de dados,
//onde os dados de objetos desse tipo poderão ser persistidos.
//Uma entidade representa, na Orientação a Objetos, uma tabela do banco de dados, e cada instância dessa entidade
//representa uma linha dessa tabela.

//@Data = @Data é uma anotação que gera o código padronizado para classes Java: getters para todos os campos,
//setters para todos os campos não-finais e o toString apropriado, equals e implementações hashCode
//que envolvem os campos da classe.

//@Builder = Builder é um padrão de projeto de software criacional que permite a separação da construção de
//um objeto complexo da sua representação, de forma que o mesmo processo de construção possa criar diferentes representações.

// @AllArgsConstructor = essa anotação é responsável por gerar um construtor com um parâmetro para cada atributo de sua classe.

//@NoArgsConstructor = essa anotação é responsável por gerar um construtor sem parâmetros,
//vale ressaltar que se tiver campos final na sua classe deverá usar um atributo force = true em sua anotação.

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    //@Id = Id da tabela

    //GeneratedValue(strategy = GenerationType.IDENTITY)

        // A anotação @GeneratedValue é utilizada para informar que a geração do valor do identificador único da entidade
        //será gerenciada pelo provedor de persistência. Essa anotação deve ser adicionada logo após a anotação @Id.
        //Quando não anotamos o campo com essa opção, significa que a responsabilidade de gerar e gerenciar as chaves
        //primárias será da aplicação, em outras palavras, do nosso código.

        //Opções:

            //GenerationType.AUTO = Valor padrão, deixa com o provedor de persistência a escolha da estratégia
            //mais adequada de acordo com o banco de dados.

            //GenerationType.IDENTITY = Informamos ao provedor de persistência que os valores a serem atribuídos ao
            //identificador único serão gerados pela coluna de auto incremento do banco de dados. Assim, um valor para
            //o identificador é gerado para cada registro inserido no banco. Alguns bancos de dados podem não suportar
            //essa opção.

            //GenerationType.SEQUENCE = Informamos ao provedor de persistência que os valores serão gerados a partir
            //de uma sequence. Caso não seja especificado um nome para a sequence, será utilizada uma sequence padrão,
            //a qual será global, para todas as entidades. Caso uma sequence seja especificada, o provedor passará a
            //adotar essa sequence para criação das chaves primárias. Alguns bancos de dados podem não suportar essa opção.

            //GenerationType.TABLE = Com a opção TABLE é necessário criar uma tabela para gerenciar as chaves primárias.
            //Por causa da sobrecarga de consultas necessárias para manter a tabela atualizada, essa opção é pouco recomendada.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Enumerated(EnumType.STRING)

        //Especifica que uma propriedade ou campo persistente deve ser persistido como um enum do tipo String.

    //Column

        //É uma anotação opcional que permite personalizar o mapeamento entre o atributo da entidade
        //e a coluna do banco de dados.

    //Column(nullable = false)

        //A anotação @Column (nullable = false) apenas adiciona uma restrição não nula à definição da tabela.
        //O Hibernate ou qualquer outra estrutura não executará nenhuma validação no atributo da entidade. O Hibernate apenas executa a instrução SQL UPDATE, e o banco de dados validará a restrição. Se o atributo de entidade for nulo, a instrução SQL falhará.

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    //Column

        //É uma anotação opcional que permite personalizar o mapeamento entre o atributo da entidade
        //e a coluna do banco de dados.

    //Column(nullable = false)

        //A anotação @Column (nullable = false) apenas adiciona uma restrição não nula à definição da tabela.
        //O Hibernate ou qualquer outra estrutura não executará nenhuma validação no atributo da entidade. O Hibernate apenas executa a instrução SQL UPDATE, e o banco de dados validará a restrição. Se o atributo de entidade for nulo, a instrução SQL falhará.


    //Unique = coluna única

    @Column(nullable = false, unique = true)
    private String number;

}
