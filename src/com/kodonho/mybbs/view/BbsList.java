package com.kodonho.mybbs.view;

import java.util.ArrayList;

import com.kodonho.mybbs.model.Bbs;

public class BbsList {
	// ��� �Ѹ���
	public void showList(ArrayList<Bbs> datas){
		for( Bbs bbs : datas){
			System.out.print(bbs.getId()+" | ");
			System.out.print(bbs.getTitle()+" | ");
			System.out.print(bbs.getAuthor()+" | ");
			System.out.print(bbs.getDate()+" | ");
			System.out.println(bbs.getView()+"");
		}
	}
	
	// ���� �̵�
	public void goInput(){
		
	}
	
	// �󼼺��� �̵�
	public void goDetail(ArrayList<Bbs> datas, long id){
		for( Bbs bbs : datas){
			if(bbs.getId() == id){
				BbsDetail detail = new BbsDetail();
				detail.showDetail(bbs);
				break; // ���ǹ��� ���յǸ� �ݺ����� �����Ѵ�.
			}
		}
	}
	
	// �˻�
	public void search(String word){
		
	}
	
	// ����
	public void delete(long id){
		
	}
}