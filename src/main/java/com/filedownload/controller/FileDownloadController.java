package com.filedownload.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;

import org.springframework.stereotype.Component;

@Component
@Path("/download")
public class FileDownloadController {

	@GET
	@Path("/pdf")
	public Response downloadPdfFile(){
		System.out.println(" ");
		System.out.println("<<<<< inside FileDownloadController >>>>> ");
		System.out.println(" ");
		/** start **/
		StreamingOutput fileStream =  new StreamingOutput(){
			@Override
			public void write(java.io.OutputStream output) throws IOException {
				try{
					java.nio.file.Path path = Paths.get("C:/temp/test.pdf");
					byte[] data = Files.readAllBytes(path);
					output.write(data);
					output.flush();
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		};
		return Response
				.ok(fileStream, MediaType.APPLICATION_OCTET_STREAM)
				.header("content-disposition","attachment; filename = myfile.pdf")
				.build();
	}

}
