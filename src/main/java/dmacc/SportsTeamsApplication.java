package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Team;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.SportsTeamsRepository;

@SpringBootApplication
public class SportsTeamsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SportsTeamsApplication.class, args);
	}

	@Autowired SportsTeamsRepository repo;
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Team t = appContext.getBean("team", Team.class);
		t.setSport("Baseball");
		t.setLocation("Minnesota");
		t.setTeamName("Twins");
		t.setNumPlayers(25);
		t.setProfessional(true);
		repo.save(t);
		
		Team tigers = new Team("Baseball", "Carroll", "Tigers", 20, false);
		Team vikings = new Team("Football", "Minnesota", "Vikings", 46, true);
		Team hawks = new Team("Basketball", "Iowa", "Hawkeyes", 15, false);
		
		repo.save(tigers);
		repo.save(vikings);
		repo.save(hawks);
		
		List<Team> allTeams = repo.findAll();
		
		for(Team team : allTeams) {
			System.out.println(team.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
