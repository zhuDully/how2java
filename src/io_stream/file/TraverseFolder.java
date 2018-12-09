package io_stream.file;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class TraverseFolder {
	public static void main(String[] args) {
		String path = "C:/LOLFolder";
		new TraverseFolder().traverseFolder2(path);
	}

	/** 1. 不使用递归的方法调用 */
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
					System.out.println("文件夹:" + file2.getAbsolutePath());
					list.add(file2);// 暂时把文件夹加入list，后续处理
					fileNum++;
				} else {
					System.out.println("文件:" + file2.getAbsolutePath());
					folderNum++;
				}
			}
			// 遍历子文件夹里文件
			File temp_file;
			while (!list.isEmpty()) {
				temp_file = list.removeFirst();// 拿出（但不放回）list的第一个元素
				files = temp_file.listFiles();
				for (File file2 : files) {
					if (file2.isDirectory()) {
						System.out.println("文件夹:" + file2.getAbsolutePath());
						list.add(file2);// 在子文件夹发现文件夹，那么继续把文件夹加入list，后续处理
						fileNum++;
					} else {
						System.out.println("文件:" + file2.getAbsolutePath());
						folderNum++;
					}
				}
			}
		} else {
			System.out.println("文件不存在!");
		}
		System.out.println("文件夹共有:" + folderNum + ",文件共有:" + fileNum);
	}

	/** 2. 使用递归的方法调用 */
	public void traverseFolder2(String path) {
		File file = new File(path);
		if (file.exists()) {
			File[] files = file.listFiles();
			if (files.length == 0) {
				System.out.println("文件夹是空的!");
				return;
			} else {
				for (File file2 : files) {
					if (file2.isDirectory()) {
						System.out.println("\n文件夹:" + file2.getAbsolutePath());
						traverseFolder2(file2.getAbsolutePath());
						System.out.println();
					} else {
						System.out.println("文件:" + file2.getAbsolutePath());
					}
				}
			}
		} else {
			System.out.println("文件不存在!");
		}
	}
	/*out：遇到文件直接输入它的绝对路径，遇到文件夹那么调用本身traverseFolder2方法（即递归）
	文件:C:\LOLFolder\DOTA.exe
	文件:C:\LOLFolder\setuperr.log
	文件夹:C:\LOLFolder\skin
	文件:C:\LOLFolder\skin\garen.ski
	文件:C:\LOLFolder\skin\garen.ski.bak
	文件:C:\LOLFolder\system.ini*/
	
	
}
