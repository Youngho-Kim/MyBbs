package com.kodonho.mybbs.view;

import java.util.Scanner;

import com.kodonho.mybbs.model.Bbs;

public class BbsInput {
	
	public Bbs process(Scanner scanner){
		System.out.println("������ �Է��ϼ���.");
		String title = scanner.nextLine();
		System.out.println("�ۼ��ڸ� �Է��ϼ���.");
		String author = scanner.nextLine();
		System.out.println("������ �Է��ϼ���.");
		String content = scanner.nextLine();
		
		Bbs bbs = new Bbs();
		bbs.setTitle(title);
		bbs.setAuthor(author);
		bbs.setContent(content);
		
		return bbs;
	}
}