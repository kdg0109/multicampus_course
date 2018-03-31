<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.List"%> 
<%@ page import="org.apache.commons.fileupload.*"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>업로드 결과</title>
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/earlyaccess/jejugothic.css">
    <style>
      body {
        font-family: 'Jeju Gothic', serif;
        font-size: 17px;
      }
    </style>
</head>
<body>
	<%
		//upload path
		String path = "C:/uploadtest/canvastest";
		//폴더가 존재하지 않을 경우 생성
		File isDir = new File(path);
		if (!isDir.isDirectory()) {
			isDir.mkdirs();
		}

		DiskFileUpload upload = new DiskFileUpload();

		upload.setSizeMax(30 * 1024 * 1024); //파일  업로드  최대  size : 10메가
		upload.setSizeThreshold(4096); //메모리에  저장할  최대  size                 
		upload.setRepositoryPath(path); //파일  임시  저장소
		List items = upload.parseRequest(request);
		int length = items.size();
		String fileName[] = new String[length];
		for (int i = 0; i < length; i++) {
			FileItem item1 = (FileItem) items.get(i);
			long fileSize = item1.getSize(); // 파일 크기 얻기
			String realFileName = item1.getName(); // 원본 파일명 얻기(DB 저장용)
			realFileName = realFileName.substring(realFileName
					.lastIndexOf("\\") + 1);

			// upload 파일 이름 지정(prefix + 시각)
			fileName[i] = realFileName.substring(0,
					realFileName.lastIndexOf("."))
					+ realFileName.substring(realFileName.lastIndexOf("."));
			File file = new File(path + "/" + fileName[i]); // 경로 + 파일명 지정

			System.out.println("fileSize         : " + item1.getSize());
			System.out.println("file               : " + file);
			System.out.println("realFileName : " + realFileName);
			System.out.println("fileName       : " + fileName);

			item1.write(file); // 파일 저장

			System.out.println(realFileName + " 저장 완료!!!");
		}
		for (int i = 0; i < length; i++) {
			out.println("<h2>" + fileName[i] + " 명으로 저장 완료되었습니다.</h2>");
		}
	%>

</body>
</html>
