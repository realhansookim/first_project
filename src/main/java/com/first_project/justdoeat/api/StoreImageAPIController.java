package com.first_project.justdoeat.api;

import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.first_project.justdoeat.entity.StoreImageInfoEntity;
import com.first_project.justdoeat.service.CopyService;
import com.first_project.justdoeat.service.StoreService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StoreImageAPIController {
@Autowired StoreService sService;
@Autowired CopyService service;
@Value("${file.image.store}")
String store_img_path;
  @PutMapping("{type}/upload")
  public ResponseEntity<Object> putImgUpload(
    @PathVariable String type, @RequestPart MultipartFile file, Long seq
  ){
    Map<String,Object> map = new LinkedHashMap<String,Object>();
    System.out.println(file.getOriginalFilename());
    Path folderLocation = null;
    if(type.equals("store")){
      folderLocation = Paths.get(store_img_path);
    }
    else{
      map.put("status",false);
      map.put("msg", "타입이 잘못되었습니다.");
      return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
    }
    String originFileName = file.getOriginalFilename();
    String[] split = originFileName.split("\\.");
    String ext =split[split.length-1];
    String filename = "";
    for(int i = 0; i<split.length-1; i++){
      filename +=split[i];
    }
    String saveFilename = "type"+"_";
    Calendar c = Calendar.getInstance();
    saveFilename =c. getTimeInMillis()+"."+ext;

    Path targetFile = folderLocation.resolve(saveFilename);
    try{
      Files.copy(file.getInputStream(), targetFile, StandardCopyOption.REPLACE_EXISTING);
    }
    catch(Exception e){
      e.printStackTrace();
    }

    if (type.equals("store")) {
      StoreImageInfoEntity data = new StoreImageInfoEntity();
      data.setSiiFileName(saveFilename);//실제파일 경로
      data.setSiiUri(filename);
      data.setSiiSimgSeq(seq);
      sService.addSajangImage(data, seq);
    }
   
    return new ResponseEntity<>(map,HttpStatus.OK);
  
  }
 @GetMapping("/image/{type}/{uri}")
 public ResponseEntity<Resource> getImg(
  @PathVariable String uri, HttpServletRequest request, @PathVariable String type
 ) throws Exception{
  Path folderLocation = null;
  if(type.equals("store")){
    folderLocation = Paths.get(store_img_path);
  }
  String filename = null;
  if(type.equals("store")){
    filename = sService.getFilenameByUri(uri);
  }
  String[] split = filename.split(("\\."));
  String ext = split[split.length-1];
  String exprotName = uri+"."+ext;
  Path targetFile = folderLocation.resolve(filename);
  Resource r = null;
  try{
    r = new UrlResource(targetFile.toUri());
  }
  catch(Exception e){
    e.printStackTrace();
  }
  String contentType = null;
  try{
    contentType = request.getServletContext().getMimeType(r.getFile().getAbsolutePath());
    if(contentType == null){
      contentType = "application/octet-stream";
    } 
 }
catch(Exception e){
  e.printStackTrace();
}
return ResponseEntity.ok()
.contentType(MediaType.parseMediaType(contentType))
.header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename*=\""+URLEncoder.encode(exprotName,"UTF-8")+"\"").body(r);
}
}
