package mvcdemo.Controllers;

import br.edu.fatecrl.mvcdemo.models.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/animal")
@RestController
public class AnimalApiController {

    private static final List<Animal> animal = new ArrayList<Animal>();
    public AnimalApiController(){

        animal.add( new Animal( "cachorro","mamifero"));
        animal.add( new Animal("nemo","aquatico"));
        animal.add( new Animal("beija flor", "ave"));
    }
    @GetMapping
    public List<Animal> getAnimal(){
        return animal;
    }

}
