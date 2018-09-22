package com.filedownload.controller;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.StreamingOutput;

import org.springframework.stereotype.Component;

@Component
@Path("/download")
public class FileDownloadController {

	@GET
	@Path("/txt")
	public Response downloadPdfFile(){
		System.out.println(" ");
		System.out.println("<<<<< inside FileDownloadController >>>>> ");
		System.out.println(" ");
		/** start **/
		StreamingOutput fileStream =  new StreamingOutput(){
			@Override
			public void write(java.io.OutputStream output) throws IOException {
				try{
					//java.nio.file.Path path = Paths.get("C:/temp/test.pdf");
					//byte[] data = Files.readAllBytes(path);
					
					byte[] data = "This is a test".getBytes();
					output.write(data);
					output.flush();
					
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		};
		
		/** Response.ok(file) this returns a ResponseBuilder **/
		/** this also returns a ResponseHeader rb.header(name, value) **/
		/** this creates the Response object rb.build() **/
				
		
		
		ResponseBuilder rb = Response.ok(fileStream, MediaType.APPLICATION_OCTET_STREAM);
		rb = rb.header("content-disposition","attachment; filename = myfile.txt");
		Response response = rb.build();
		response.status(404, "I just dont like it");
		//response.status(406, "I just dont like it");
		return response;
		/**
		return Response
				.ok(fileStream, MediaType.APPLICATION_OCTET_STREAM)
				.header("content-disposition","attachment; filename = myfile.txt")
				.build();
		**/
	}
	


}
