package demo.jenkins.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdPipelineApplication.class, args);
	}

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to demo project of CICD pipeline using Jenkins and Docker";
	}
/*
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/PratikKore777/ci-cd-pipeline.git
git push -u origin main
*/
}
