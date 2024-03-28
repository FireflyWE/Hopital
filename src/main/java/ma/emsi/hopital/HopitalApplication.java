package ma.emsi.hopital;

import ma.emsi.hopital.entities.Patient;
import ma.emsi.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//method ajout 1 without args
		Patient patient1=new Patient();
		patient1.setId(null);
		patient1.setNom("Yamcha");
		patient1.setDateNaissance(new Date());
		patient1.setMalade(true);
		patient1.setScore(50);
		patientRepository.save(patient1);

		//method ajout 2 with args
		Patient patient2=new Patient(null,"krillin",new Date(),false,20);
		patientRepository.save(patient2);

		//method ajout 3 en utilisant Builder
		Patient patient3=Patient.builder()
				.nom("Bulma")
				.dateNaissance(new Date())
				.malade(false)
				.score(110)
				.build();
		patientRepository.save(patient3);
	}
}
