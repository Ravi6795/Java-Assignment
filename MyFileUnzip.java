import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class MyFileUnzip {

	public void unzipFile(String filePath){
		
		FileInputStream fis = null;
		ZipInputStream zipIs = null;
		ZipEntry zipEntry = null;
		try {
			fis = new FileInputStream(filePath);
			zipIs = new ZipInputStream(new BufferedInputStream(fis));
			while((zipEntry = zipIs.getNextEntry()) != null){
				try{
					byte[] tmp = new byte[4*1024];
					FileOutputStream fos = null;
					String opFilePath = "Z:/"+zipEntry.getName();
					System.out.println("Extracting file to "+opFilePath);
					fos = new FileOutputStream(opFilePath);
					int size = 0;
					while((size = zipIs.read(tmp)) != -1){
						fos.write(tmp, 0 , size);
						
					}
				
					fos.flush();
					fos.close();
				} catch(Exception ex){
					
				}
			}
			zipIs.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]){
		
		MyFileUnzip mef = new MyFileUnzip();
		mef.unzipFile("Z:/Archive.zip");
	}
}