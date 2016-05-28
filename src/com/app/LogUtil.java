package com.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class LogUtil {
	
	private static final String filePath = "intercept.log";
	public static StringBuilder write = new StringBuilder();

	@SuppressWarnings("resource")
	private static String getContent() {
		StringBuilder content = new StringBuilder();
		String line = new String();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(filePath));
			while ((line = br.readLine()) != null) {
				content.append(line + "\n");
			}
			return content.toString();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void writingText(String text) {
		try {
			File file = new File(filePath);
			String content = new String();
			if (file.exists()) {
				content = getContent();
			} else {
				file.createNewFile();
			}

			Date data = new Date();
			FileWriter filewt = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(filewt);
			bw.write(content);
			bw.write(data.toString() + ": " + text);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}