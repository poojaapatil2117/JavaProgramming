package FileIO;
import java.io.*;

public class PipeInputStreamExample {

	public static void main(String[] args) {
		try 
		{
			PipedOutputStream pos = new PipedOutputStream();
			PipedInputStream pis = new PipedInputStream(pos);
			
			Thread t1 = new Thread(() -> {
				try
				{
					for(int i=0;i<10;i++)
					{
						pos.write(i);
						System.out.println("Written "+i);
						Thread.sleep(500);
					}
					pos.close();
				}
				catch(Exception e) {e.printStackTrace();}
			});
			
			Thread t2 = new Thread(()->{
				
				try {
					int data;
					
					while((data = pis.read())!=-1)
					{
						System.out.println("Read "+data);
					}
					pis.close();
					
				}catch(Exception e) {e.printStackTrace();}
			});
			
			t1.start();
			t2.start();
		}catch(Exception e) {e.printStackTrace();}
	}

}
