package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import entities.LogEntry;

public class ApplicationSet {

	public static void main(String[] args) {

		final URL resource = ApplicationSet.class.getClassLoader().getResource("set.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(resource.getFile()))) {

			final Set<LogEntry> set = new HashSet<>();

			String line = br.readLine();

			while (line != null) {

				String[] vect = line.split(" ");
				String userName = vect[0];
				Date moment = Date.from(Instant.parse(vect[1]));
				set.add(new LogEntry(userName, moment));
				line = br.readLine();

			}
			System.out.println("Total Users = " + set.size());

		} catch (IOException o) {
			System.out.println(o.getMessage());
		}

	}

}
