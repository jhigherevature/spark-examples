package sparktools.utility;

public class BatchFileContent {
	public static String getBatchFileContent_FileWrite() {
		return 	"@Echo off\r\n"
				+ "cd " + DataUtility.APPPATH +"\\batch_files\r\n"
				+ "SET dirpath=..\\lab_weeks\\\r\n"
				+ ":: loop through files and write student names to 'assignment_list' folder\r\n"
				+ "for /F \"tokens=1 delims=:\" %%a in ('dir %dirpath% /B') do (\r\n"
				+ "   echo \"Dir: %dirpath%%%a\"\r\n"
				+ "   for /F \"tokens=1 delims=:\" %%b in ('dir \"%dirpath%%%a\" /B') do (\r\n"
				+ "      echo \"file is: %%b\"\r\n"
				+ "	  dir \"%dirpath%%%a\\%%b\" /B > \"..\\assignment_list\\%%b.txt\"\r\n"
				+ "   )\r\n"
				+ ")";
	}
	public static String getBatchFileContent_WeekExtract() {
		return 	"@Echo off\r\n"
				+ "SET workpath="+ DataUtility.APPPATH +"\r\n"
				+ "cd %workpath%\\batch_files\r\n"
				+ "SET zippath=%workpath%\\zip_files\r\n"
				+ "SET destpath=%workpath%\\lab_weeks\r\n"
				+ ":: unzip files from Rev Pro\r\n"
				+ "for %%I in (\"%zippath%\\*.zip\") do (\r\n"
				+ "    echo %%I\r\n"
				+ "	7z x -aoa -y -o\"%zippath%\" \"%%I\"\r\n"
				+ ")\r\n"
				+ ":: remove zip files\r\n"
				+ "for %%I in (\"%zippath%\\*.zip\") do (\r\n"
				+ "    echo %%I\r\n"
				+ "	del \"%%I\"\r\n"
				+ ")\r\n"
				+ ":: move 'Week' folders from unzipped files to 'lab_weeks' folder\r\n"
				+ "for /F \"tokens=1 delims=:\" %%a in ('dir %zippath% /B') do (\r\n"
				+ "    echo %%a\r\n"
				+ "	for /F \"tokens=1 delims=:\" %%b in ('dir \"%zippath%\\%%a\" /B') do (\r\n"
				+ "		IF EXIST \"%destpath%\\%%b\" (\r\n"
				+ "		robocopy \"%zippath%\\%%a\\%%b\" \"%destpath%\\%%b\" /s /np\r\n"
				+ "		) ELSE (\r\n"
				+ "			  move /Y \"%zippath%\\%%a\\%%b\" \"%destpath%\"\r\n"
				+ "		)\r\n"
				+ "	)\r\n"
				+ ")";
	}
	public static String getBatchFileContent_ClearZip() {
		return 	"@Echo off\r\n"
				+ "SET workpath="+ DataUtility.APPPATH +"\r\n"
				+ "cd %workpath%\\batch_files\r\n"
				+ "SET zippath=%workpath%\\zip_files\r\n"
				+ ":: Remove folders and files from zip_files folder\r\n"
				+ "for /F \"tokens=1 delims=:\" %%i in ('dir %zippath% /B') do (\r\n"
				+ "    echo %zippath%\\%%i\r\n"
				+ "	rmdir \"%zippath%\\%%i\" /s /q\r\n"
				+ ")\r\n";
	}
	public static String getBatchFileContent_ClearLab() {
		return 	"@Echo off\r\n"
				+ "SET workpath="+ DataUtility.APPPATH +"\r\n"
				+ "cd %workpath%\\batch_files\r\n"
				+ "SET destpath=%workpath%\\lab_weeks\r\n"
				+ ":: Remove folders and files from zip_files folder\r\n"
				+ "for /F \"tokens=1 delims=:\" %%i in ('dir %destpath% /B') do (\r\n"
				+ "	echo %%i\r\n"
				+ "    echo \"%destpath%\\%%i\"\r\n"
				+ "	rmdir \"%destpath%\\%%i\" /s /q\r\n"
				+ ")\r\n";
	}
}
