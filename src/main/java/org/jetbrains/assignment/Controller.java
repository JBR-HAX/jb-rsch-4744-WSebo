package payroll;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {

  private final Repository repository;

  EmployeeController(Repository repository) {
    this.repository = repository;
  }

 // TODO: I gave up. I dont know Java + I dont have Java installed, so dont even know if my code compiles.
  //I am used to use Copilot, but even that wont help if i Dont know if my code compile succesfully.am
  // The main blocker is that I dont know Java syntax, and Rider dont prompt me of correct one, so feeling is like writting in notepad.
  // I hope my example was somehow useful for you :)
  @PostMapping("/moves")
  Employee newEmployee(@RequestBody Coordinates[] coordinatesArray) {
      for (int coordinates : coordinatesArray) 
        return repository.save(coordinates);
  }
}