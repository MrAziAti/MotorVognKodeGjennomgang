package kodegjennomgangmotorvogn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class Controller {
    @Autowired
    AppRepo repo = new AppRepo();


    @PostMapping("lagre")
    public void lagre(MotorVogn motorVogn){
        repo.leggInn(motorVogn);
    }

    @GetMapping("/hentAlle")
    public ArrayList<MotorVogn> hent(){
        return repo.hentAlle();
    }

    @DeleteMapping("slett")
    public void slett(){
        repo.slettAlle();
    }
}
