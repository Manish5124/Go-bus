package com.bus.gobus;

import com.bus.gobus.repository.bookingrepository;
import com.bus.gobus.repository.busdatarepository;
import com.bus.gobus.repository.customerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GobusApplication implements CommandLineRunner {

	@Autowired
	bookingrepository bookingrepo;

	@Autowired
	busdatarepository busdatarepo;

	@Autowired
	customerrepository customerrepo;

	public static void main(String[] args) {
		SpringApplication.run(GobusApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookingrepo.deleteAll();
		busdatarepo.deleteAll();
		customerrepo.deleteAll();
	}
}
