package com.petifee.exception;

public class ArticleNotFound extends Exception{
	@Override
	public String getMessage(){
		return "지정하신 게시물이 없습니다.글 번호가 올바르지 않거나 이미 삭제된 게시물입니다.";
	}
}

