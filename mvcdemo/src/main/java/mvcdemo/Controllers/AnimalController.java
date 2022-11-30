package mvcdemo.Controllers;


import br.edu.fatecrl.mvcdemo.models.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/animal")
public class AnimalController {

    private static final List<Animal> animal = new ArrayList<Animal>();

    public AnimalController() {
        animal.add( new Animal( "cachorro","mamifero"));
        animal.add( new Animal("nemo","aquatico"));
        animal.add( new Animal("beija flor", "ave"));
    }
    @GetMapping
    public String getAnimal(Model model){

        model.addAttribute("animal", animal);
        return "animal";

    }

}
