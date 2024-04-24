package ma.emsi.hopital;

import ma.emsi.hopital.entities.Patient;
import ma.emsi.hopital.repository.PatientRepository;
import ma.emsi.hopital.security.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

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
		/*Patient patient1=new Patient();
		patient1.setId(null);
		patient1.setNom("Yamcha");
		patient1.setDateNaissance(new Date());
		patient1.setMalade(true);
		patient1.setScore(500);
		patientRepository.save(patient1);

		//method ajout 2 with args
		Patient patient2=new Patient(null,"krillin",new Date(),false,200);
		patientRepository.save(patient2);

		//method ajout 3 en utilisant Builder
		Patient patient3=Patient.builder()
				.nom("Bulma")
				.dateNaissance(new Date())
				.malade(false)
				.score(110)
				.build();
		patientRepository.save(patient3);*/
	}
	//@Bean
	CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager){
		PasswordEncoder passwordEncoder = passwordEncoder();
		return args -> {
				jdbcUserDetailsManager.createUser(
					User.withUsername("user12").password(passwordEncoder.encode("1234")).roles("USER").build());
				jdbcUserDetailsManager.createUser(
					User.withUsername("user22").password(passwordEncoder.encode("1234")).roles("USER").build());
				jdbcUserDetailsManager.createUser(
					User.withUsername("admin2").password(passwordEncoder.encode("1234")).roles("ADMIN","USER").build());

		};
	}

	@Bean
	CommandLineRunner commandLineRunnerDetails(AccountService accountService){
		return args -> {
			accountService.addRole("USER");
			accountService.addRole("ADMIN");
			accountService.addNewUser("user1", "1234", "user1@gmail.com", "1234");
			accountService.addNewUser("user2", "1234", "user2@gmail.com", "1234");
			accountService.addNewUser("admin", "1234", "admin@gmail.com", "1234");


			accountService.addRoleToUser("user1", "USER");
			accountService.addRoleToUser("user2", "USER");
			accountService.addRoleToUser("admin", "USER");
			accountService.addRoleToUser("admin", "ADMIN");

		};
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
