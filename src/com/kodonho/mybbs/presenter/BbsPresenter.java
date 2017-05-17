package com.kodonho.mybbs.presenter;

import java.util.ArrayList;
import java.util.Scanner;

import com.kodonho.mybbs.model.Bbs;
import com.kodonho.mybbs.view.BbsInput;
import com.kodonho.mybbs.view.BbsList;

public class BbsPresenter {
	final boolean START = true;
	final boolean FINISH = false;
	boolean runFlag = START;
	
	// ������ �ӽ� �����
	ArrayList<Bbs> datas;
	
	Scanner scanner;
	BbsInput input;
	BbsList list;
	
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
				// datas.add(input.process(scanner));
				Bbs bbs =input.process(scanner);
				datas.add(bbs);
				break;
			case "r":
				
				break;
			}
		}
	}
	
	public void end(){
		runFlag = FINISH;
	}
	
}
