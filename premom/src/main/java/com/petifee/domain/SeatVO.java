package com.petifee.domain;

import java.util.Date;

public class SeatVO {
	private int idx;
	private int is_seat;
	
	public SeatVO(){
	}

	
	public SeatVO(int idx, int is_seat){
		this.idx = idx;
		this.is_seat = is_seat;
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


}
