package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {
		// TODO Auto-generated constructor stub
	}
	
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		for (int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i)==' ') {
				throw new CharCheckException("üũ�� ���ڿ� �ȿ� ������ ���ԵǾ� �ֽ��ϴ�.");
			} else {
				if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122) {
					count++;
				}
			}
		}
		return count;
	}

}