package sparktools.services;

import java.io.IOException;

import sparktools.utility.DataUtility;

public class BatchFileExecutorService {
	public void executeBatchFile(String batchFileName) {
		try {
				System.out.println("Executing " + batchFileName + "...");
				String[] command = new String[]{"cmd.exe","/C",DataUtility.BATCHFILEPATH+"\\" + batchFileName};
				Process p = Runtime.getRuntime().exec(command);
				p.waitFor();
				System.out.println("Batch File Execution Complete");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
