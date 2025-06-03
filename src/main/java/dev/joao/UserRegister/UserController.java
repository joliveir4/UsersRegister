package dev.joao.UserRegister;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController: This marks the class as a REST controller, meaning it will handle HTTP requests and return data (usually JSON) directly in the response body.
@RestController

// @RequestMapping: Sets the base URL path for all endpoints in this controller.
@RequestMapping

public class UserController {

 /* @GetMapping("/boasvindas"): Maps HTTP GET requests to the "/boasvindas" path to a specific method in the controller.
  * For example, accessing http://localhost:8080/boasvindas will call the method linked to this annotation.
  */
    @GetMapping("/boasvindas")
    public String boaVindas(){
       return "Seja bem vindo a minha primeira rota.";
    }


}
