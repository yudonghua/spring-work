package com.demo;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
		CSVReader reader = new CSVReader(new FileReader("yourfile.csv"));
		String [] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			// nextLine[] is an array of values from the line
			System.out.println(nextLine[0] + nextLine[1] + "etc...");
		}
	}

}
