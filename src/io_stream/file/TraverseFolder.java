package io_stream.file;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class TraverseFolder {
	public static void main(String[] args) {
		String path = "C:/LOLFolder";
		new TraverseFolder().traverseFolder2(path);
	}

	/** 1. ��ʹ�õݹ�ķ������� */
	public void traverseFolder1(String path) {
		int fileNum = 0, folderNum = 0;
		File file = new File(path);
		if (file.exists()) {
			LinkedList<File> list = new LinkedList<File>();
			File[] files = file.listFiles();
			/*
			 * [C:\LOLFolder\DOTA.exe, C:\LOLFolder\setuperr.log, C:\LOLFolder\skin,
			 * C:\LOLFolder\system.ini, C:\LOLFolder\win.ini, ]
			 */
			for (File file2 : files) {
				if (file2.isDirectory()) {
					System.out.println("�ļ���:" + file2.getAbsolutePath());
					list.add(file2);// ��ʱ���ļ��м���list����������
					fileNum++;
				} else {
					System.out.println("�ļ�:" + file2.getAbsolutePath());
					folderNum++;
				}
			}
			// �������ļ������ļ�
			File temp_file;
			while (!list.isEmpty()) {
				temp_file = list.removeFirst();// �ó��������Żأ�list�ĵ�һ��Ԫ��
				files = temp_file.listFiles();
				for (File file2 : files) {
					if (file2.isDirectory()) {
						System.out.println("�ļ���:" + file2.getAbsolutePath());
						list.add(file2);// �����ļ��з����ļ��У���ô�������ļ��м���list����������
						fileNum++;
					} else {
						System.out.println("�ļ�:" + file2.getAbsolutePath());
						folderNum++;
					}
				}
			}
		} else {
			System.out.println("�ļ�������!");
		}
		System.out.println("�ļ��й���:" + folderNum + ",�ļ�����:" + fileNum);
	}

	/** 2. ʹ�õݹ�ķ������� */
	public void traverseFolder2(String path) {
		File file = new File(path);
		if (file.exists()) {
			File[] files = file.listFiles();
			if (files.length == 0) {
				System.out.println("�ļ����ǿյ�!");
				return;
			} else {
				for (File file2 : files) {
					if (file2.isDirectory()) {
						System.out.println("\n�ļ���:" + file2.getAbsolutePath());
						traverseFolder2(file2.getAbsolutePath());
						System.out.println();
					} else {
						System.out.println("�ļ�:" + file2.getAbsolutePath());
					}
				}
			}
		} else {
			System.out.println("�ļ�������!");
		}
	}
	/*out�������ļ�ֱ���������ľ���·���������ļ�����ô���ñ���traverseFolder2���������ݹ飩
	�ļ�:C:\LOLFolder\DOTA.exe
	�ļ�:C:\LOLFolder\setuperr.log
	�ļ���:C:\LOLFolder\skin
	�ļ�:C:\LOLFolder\skin\garen.ski
	�ļ�:C:\LOLFolder\skin\garen.ski.bak
	�ļ�:C:\LOLFolder\system.ini*/
	
	
}
