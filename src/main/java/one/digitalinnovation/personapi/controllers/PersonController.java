package one.digitalinnovation.personapi.controllers;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personapi.exception.PersonNotFoundException;
import one.digitalinnovation.personapi.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

//@RestController: @Controller + @ResponseBody

    //@Controller

        //A anotação @Controller é uma anotação usada no framework Spring MVC (o componente do Spring Framework
        //usado para implementar o aplicativo da Web). A anotação @Controller indica que uma classe particular serve como
        //controlador. A anotação @Controller atua como um estereótipo para a classe anotada, indicando sua função.
        //O despachante verifica essas classes anotadas em busca de métodos mapeados e detecta as anotações @RequestMapping.

    //@ResponseBody em cada metódo
        //A anotação @ResponseBody informa a um controlador que o objeto retornado é serializado automaticamente
        //em JSON e passado de volta para o objeto HttpResponse .

//@RequestMapping

    //A anotação @RequestMapping mapeia uma classe, ou seja, associa uma URI a uma classe. Ao acessar a URL,
    //os metódos mapeados da classe podem ser acessados.

//@AllArgsConstructor(onConstructor = @__(@Autowired))

    // @AllArgsConstructor = essa anotação é responsável por gerar um construtor com um parâmetro para cada atributo de sua classe.
    //@__(@Autowired) = essa anotação insere a anotação @Autowired no construtor gerado
    //@Autowired = Injeção automática de dependência
        //A anotação @Autowired fornece controle sobre onde e como a ligação entre os beans deve ser realizada.
        //Pode ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes arbitrários
        //e/ou vários argumentos.

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private final PersonService personService;

    //@PostMapping

        //@PostMapping é uma versão especializada da anotação @RequestMapping que atua
        //como um atalho para @RequestMapping(method = RequestMethod.POST).

    //@ResponseStatus

        //Define qual status a requisição irá retornar

    //@RequestBody

        //A anotação @RequestBody mapeia o corpo HttpRequest para uma transferência ou objeto de domínio, permitindo a
        //desserialização automática do corpo HttpRequest de entrada em um objeto Java.

    //@Valid

        //Valida os campos do objeto com base nas restrições impostas no personDTO

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody @Valid PersonDTO personDTO) {
        return personService.create(personDTO);
    }

    //@GetMapping

        //@GetMapping é uma versão especializada da anotação @RequestMapping que atua
        //como um atalho para @RequestMapping(method = RequestMethod.GET).

    //@ResponseStatus

        //Define qual status a requisição irá retornar

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }

    //@GetMapping

        //@GetMapping é uma versão especializada da anotação @RequestMapping que atua
        //como um atalho para @RequestMapping(method = RequestMethod.GET).

    @GetMapping
    public List<PersonDTO> listAll() {
        return personService.listAll();
    }

    //@PutMapping

        //@PutMapping é uma versão especializada da anotação @RequestMapping que atua
        //como um atalho para @RequestMapping(method = RequestMethod.PUT).

    //@ResponseStatus

        //Define qual status a requisição irá retornar

    //@PathVariable

        //Anotação que indica que um parâmetro de método deve ser vinculado a uma variável de modelo de URI.

    //@RequestBody

        //A anotação @RequestBody mapeia o corpo HttpRequest para uma transferência ou objeto de domínio, permitindo a
        //desserialização automática do corpo HttpRequest de entrada em um objeto Java.

    //@Valid

        //Valida os campos do objeto com base nas restrições impostas no DTO

    //@Valid
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MessageResponseDTO update(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException {
        return personService.update(id, personDTO);
    }


    //@DeleteMapping

        //@DeleteMapping é uma versão especializada da anotação @RequestMapping que atua
        //como um atalho para @RequestMapping(method = RequestMethod.DELETE).

    //@PathVariable

        //Anotação que indica que um parâmetro de método deve ser vinculado a uma variável de modelo de URI.

    //@ResponseStatus

        //Define qual status a requisição irá retornar

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) throws PersonNotFoundException {
        personService.delete(id);
    }


}
