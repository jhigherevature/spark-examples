package sparktools.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkBookReader {
	// Allow to type this in...
	public static String[] readFileData(String filePath) throws IOException {
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		List<String> lines = new ArrayList<String>();
		String line = null;
		while ((line = br.readLine()) != null) {
			lines.add(line);
		}

		br.close();
		return lines.toArray(new String[lines.size()]);
	}

	public static String[] getLabNames() {
		File folder = new File(DataUtility.LABFILEPATH);
		if (folder.isDirectory()) {
			List<String> fileNames = new ArrayList<String>(); 
			File[] files = folder.listFiles();

			for (File f : files) {
				if (f.isFile()) {
					// System.out.println(f.getName());
					fileNames.add(f.getName());
				}
			}
			
			return fileNames.toArray(new String[fileNames.size()]);
		} else 
			return null;
	}
}
