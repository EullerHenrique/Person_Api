package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

// @Getter/@Setter

    //Você pode anotar qualquer campo com @Gettere / ou @Setter, para permitir que o lombok gere o getter
    // setter padrão automaticamente.
    //Você também pode colocar uma anotação @Gettere / ou @Setter em uma classe. Nesse caso, é como se você anotasse
    //todos os campos não estáticos dessa classe com a anotação.

// @AllArgsConstructor = essa anotação é responsável por gerar um construtor com um parâmetro para cada atributo de sua classe.

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String description;
}
