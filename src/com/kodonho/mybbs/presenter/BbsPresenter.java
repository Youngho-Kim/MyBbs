package com.kodonho.mybbs.presenter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.kodonho.mybbs.model.Bbs;
import com.kodonho.mybbs.view.BbsDetail;
import com.kodonho.mybbs.view.BbsInput;
import com.kodonho.mybbs.view.BbsList;

public class BbsPresenter {
	final boolean START = true;
	final boolean FINISH = false;
	boolean runFlag = START;
	
	// ������ �ӽ� �����                     1    3    3
	ArrayList<Bbs> datas; // { Bbs, Bbs, Bbs ... }
	
	Scanner scanner;
	BbsInput input;
	BbsList list;
	BbsDetail detail;
	
	int number = 0;
	
	public BbsPresenter(){
		init();
	}
	
	/**
	 * �ʱ�ȭ �Լ�, ����� ��ü���� �̸� �޸𸮿� �ε��صд�
	 */
	private void init(){
		scanner = new Scanner(System.in);
		input = new BbsInput();
		list = new BbsList();
		detail = new BbsDetail();
		datas = new ArrayList<>();
	}
	
	public void start(){
		while(runFlag){
			System.out.println("��ɾ �Է��ϼ��� [l:���, w:����, r:�󼼺���]");
			String command = scanner.nextLine();
			switch(command){
			case "l":
				list.showList(datas);
				break;
			case "w":
				write();
				break;
			case "r":
				goDetail();
				break;
			}
		}
	}
	
	private void write(){
		// datas.add(input.process(scanner));
		Bbs bbs =input.process(scanner);
		number = number + 1;
		bbs.setId(number);
		bbs.setDate(getDate());
		datas.add(bbs);
	}
	
	private String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long currentTime = System.currentTimeMillis();
		return sdf.format(currentTime);
	}
	
	// �󼼺��� �̵�
	private void goDetail(){
		System.out.println("�۹�ȣ�� �Է��ϼ���;");
		String temp = scanner.nextLine();
		long id = Long.parseLong(temp);
		for( Bbs bbs : datas){
			if(bbs.getId() == id){
				detail.showNo(bbs.getId());
				detail.showTitle(bbs.getTitle());
				detail.showAuthor(bbs.getAuthor());
				detail.showDate(bbs.getDate());
				detail.showCount(bbs.getView());
				detail.showContent(bbs.getContent());
				detail.endDetail(); // ���� �Ʒ��� ������ �׾��ش�.
				break; // ���ǹ��� ���յǸ� �ݺ����� �����Ѵ�.
			}
		}
	}
	
	public void end(){
		runFlag = FINISH;
	}
	
}
