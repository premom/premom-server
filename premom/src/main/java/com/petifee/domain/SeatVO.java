package com.petifee.domain;

import java.util.Date;

public class SeatVO {
	private int idx;
	private int is_seat;
	private String name;
	private int fast_transfer;
	
	
	public SeatVO(){
	}

	
	public SeatVO(int idx, int is_seat, String name, int fast_transfer){
		this.idx = idx;
		this.is_seat = is_seat;
		this.name = name;
		this.fast_transfer = fast_transfer;
	}

	public int getIs_seat() {
		return is_seat;
	}

	public void setIs_seat(int is_seat) {
		this.is_seat = is_seat;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getFast_transfer() {
		return fast_transfer;
	}

	public void setFast_transfer(int fast_transfer) {
		this.fast_transfer = fast_transfer;
	}


}
