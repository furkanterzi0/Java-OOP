import java.io.*;
public class Program {

	public static void main(String[] args) throws IOException {
		File file=new File("kod.txt");
		
		if(!file.exists()) {
			file.createNewFile();
		}

		String val="Kodlama vakti ! ";
		FileWriter fileWriter=new FileWriter(file,false);
		BufferedWriter bWriter=new BufferedWriter(fileWriter);
		bWriter.write(val);
		bWriter.write("\njava");
		bWriter.close();  
		
		FileReader fReader=new FileReader(file);
		String line;
		
		BufferedReader bReader=new BufferedReader(fReader);
		while((line=bReader.readLine())!=null) {
			System.out.println(line);
		}
		bReader.close();
	}

}
