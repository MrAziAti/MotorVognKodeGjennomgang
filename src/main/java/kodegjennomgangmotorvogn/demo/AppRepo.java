package kodegjennomgangmotorvogn.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AppRepo {

    private final ArrayList<MotorVogn> motorvognListe = new ArrayList<>();

    public void leggInn(MotorVogn motorVogn){
        motorvognListe.add(motorVogn);
    }

    public ArrayList <MotorVogn> hentAlle(){
        return motorvognListe;
    }
    public void slettAlle(){
        motorvognListe.clear();
    }
}
