package com.filedownload.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
@Path("/download")
public class FileDownloadController {
	
	@GET
    @Path("/pdf")
    public Response downloadPdfFile(){
		return null;
	}
}
