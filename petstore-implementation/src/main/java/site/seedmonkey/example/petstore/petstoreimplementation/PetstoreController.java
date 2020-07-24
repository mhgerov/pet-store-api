package site.seedmonkey.example.petstore.petstoreimplementation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetstoreController {

    @PostMapping(path = "/pets")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPet() {
        System.out.println("Message received!");
    }
}
