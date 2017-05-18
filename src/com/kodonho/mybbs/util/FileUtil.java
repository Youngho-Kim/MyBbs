package com.kodonho.mybbs.util;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	
	public static void makeDirectoryIfNotExist(String dirPath){
		File dir = new File(dirPath);
		if(!dir.exists()){
			dir.mkdirs(); // �˻��� ��λ��� ��� ���丮�� �������ش�
		}
	}
	
	public static File getFile(String path){
		File database = new File(path);
		if(!database.exists()){
			makeFile(database);
			database = new File(path);
		}
		return database;
	}
	
	public static void makeFile(File database){
		try {
			database.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
