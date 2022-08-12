package io.myfenix.banana;

import io.myfenix.banana.controller.Day;
import io.myfenix.banana.controller.Doctor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class VibinApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VibinApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Doctor doctor1 = new Doctor(1, "RAUL");
		doctor1.setAvailable(new Date(), "3pm");
		doctor1.setAvailable(new Date(), "4pm");
		doctor1.setAvailable(new Date(), "5pm");

		for (Doctor.Appointment a: doctor1.getAvailable()) {
			System.out.println(a.getDate() + " " + a.getTime());
		}
		System.out.println(Day.MONDAY.getSpanish());
	}

}
