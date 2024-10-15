package FileIO;


import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/*
public class NIOExample {

	public static void main(String[] args) {

        Path path = Paths.get("example.txt");

        // Write to a file using NIO
        try(FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE)){
            String data = "Hello, From NIO!";
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put(data.getBytes());
            buffer.flip();
            fileChannel.write(buffer);
        }catch (IOException e) {
            e.printStackTrace();
        }

        // Read from a file using NIO
        try(FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = fileChannel.read(buffer);
            buffer.flip();
            byte[] bytes = new byte[bytesRead];
            buffer.get(bytes);
            System.out.println(new String(bytes));
        } catch (IOException e){
            e.printStackTrace();
        }
	}
}
*/
//==================================================
/*

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOExample {
	public static void main(String[] args){
		try (RandomAccessFile file = new RandomAccessFile("example.txt", "r");
				FileChannel channel = file.getChannel()){

			ByteBuffer buffer = ByteBuffer.allocate(48);
			int bytesRead = channel.read(buffer);

			while (bytesRead != -1) {
				buffer.flip();
				while (buffer.hasRemaining()) {
					System.out.print((char) buffer.get());
				}
				buffer.clear();
				bytesRead = channel.read(buffer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
*/
//====================================================

//Selctors
/*

public class NIOExample {
	public static void main(String[] args)
	{
		Path path = new Paths.get("example.txt");
		try(FileChannel filechannal = new FileChannel.open(path,StandardOpenOption.READ)){
			
			ByteBuffer header = ByteBuffer.allocate(1000);
			ByteBuffer body = ByteBuffer.allocate(239);
			
			ByteBuffer buffers[] = {header,body};
			filechannal.read(buffers);
			header.flip();
			body.flip();

			System.out.println("Header :"+new String(header.array(),0,header.limit()));
			System.out.println("Body :"+new String(body.array(),0,body.limit()));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}

//===============

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOExample {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        try (FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ)) {
            ByteBuffer header = ByteBuffer.allocate(128);
            ByteBuffer body = ByteBuffer.allocate(1024);
            ByteBuffer[] buffers = {header, body};

            fileChannel.read(buffers);

            header.flip();
            body.flip();

            System.out.println("Header: " + new String(header.array(), 0, header.limit()));
            System.out.println("Body: " + new String(body.array(), 0, body.limit()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//===============================================================

//Create And Write:

public class NIOExample {
    public static void main(String[] args) {
    	
    	Path path = Paths.get("example.txt");
    	
    	try(FileChannel filechannel = FileChannel.open(path,StandardOpenOption.WRITE,StandardOpenOption.CREATE)){

    		ByteBuffer header = ByteBuffer.wrap("Hello How Are You".getBytes());
    	    ByteBuffer body = ByteBuffer.wrap("byeeeeeeeeeeeeeeee".getBytes());
    	    ByteBuffer buffers[]= {header,body};
    	    
    	    filechannel.write(buffers);
    	    System.out.println("Data Wrriten To file");
    	}
    	catch(Exception e) 
    	{
    		e.printStackTrace();
    	}    	
    }
   }

//============================================

//Write File Using Lock :

public class NIOExample {
    public static void main(String[] args) {
    	
    	Path path = Paths.get("example.txt");
    	
    	try(FileChannel filechannel = FileChannel.open(path,StandardOpenOption.WRITE,StandardOpenOption.CREATE)){

    		FileLock lock = filechannel.lock();
    		System.out.println("File is Locked ");
    		
    		ByteBuffer header = ByteBuffer.wrap("Hello Good Morning to All :".getBytes());
    		
    		filechannel.write(header);
    		
    		lock.release();
    		
    		System.out.println("File is Released:");
    	}
    	catch(Exception e) 
    	{
    		e.printStackTrace();
    	}    	
    }
   }

//========================================

//Read File Using Lock

public class NIOExample {
    public static void main(String[] args) {
    	
    	Path path = Paths.get("example.txt");
    	
    	try(FileChannel filechannel = FileChannel.open(path,StandardOpenOption.READ)){

    		FileLock lock = filechannel.lock(0,Long.MAX_VALUE,true);
    		System.out.println("File is Locked ");
    		
    		ByteBuffer header = ByteBuffer.allocate(584);
    		filechannel.read(header);
    		header.flip();
    		
    		byte data[]= new byte[header.limit()];
    		header.get(data);
    		
    		System.out.println("Read Data :"+new String(data));
    		
    		lock.release();
    		System.out.println("File is Released:");
    	}
    	catch(Exception e) 
    	{
    		e.printStackTrace();
    	}    	
    }
   }
*/
//===============================================================


public class NIOExample {
    public static void main(String[] args) {
    	
    	Path path = Paths.get("example.txt");
    	
    	try(FileChannel filechannel = FileChannel.open(path,StandardOpenOption.WRITE,StandardOpenOption.CREATE)){

    		FileLock lock = filechannel.lock(0,100,false);
    		System.out.println("File is Locked ");
    		
    		ByteBuffer header = ByteBuffer.wrap("This is some test data for a specific region :".getBytes());
    		
    		filechannel.write(header);
    		
    		lock.release();
    		
    		System.out.println("File is Released:");
    	}
    	catch(Exception e) 
    	{
    		e.printStackTrace();
    	}    	
    }
  }