import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class TestFileAppend {

	public static void main(String[] args) throws IOException {
		File dir = new File("d:/ttttt");
		dir.mkdirs();
		File file = new File("d:/ttttt/tt.txt");
		FileOutputStream fos = new FileOutputStream(file, true);
		fos.write(("haha22"+new Date().toString()).getBytes());
	}

}
