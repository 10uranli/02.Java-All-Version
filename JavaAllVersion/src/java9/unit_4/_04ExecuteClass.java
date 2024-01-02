package java9.unit_4;



import java.io.IOException;
import java.time.ZoneId;

public class _04ExecuteClass {

	public static void main(String[] args) throws IOException {
		ProcessBuilder builder = new ProcessBuilder("/Users/dilangursoz/Desktop/npp.8.5.8.Installer.x64.exe");
		//permision denied hatasi icin chmod u+x /Users/dilangursoz/Desktop/npp.8.5.8.Installer.x64.exe
		Process process = builder.start();
		ProcessHandle.Info info = process.info();
		String errorMsg = "Bulunamadi";
		System.out.println(process.pid());
		System.out.println(info.user().orElse(errorMsg));
		System.out.println(info.command().orElse(errorMsg));
		System.out.println(info.commandLine().orElse(errorMsg));
		System.out.println(info.user().orElse(errorMsg));

		System.out.printf("Start time: %s%n",
				info.startInstant().map(i -> i.atZone(ZoneId.systemDefault())
						.toLocalDateTime().toString()).orElse(errorMsg));
	}

}
