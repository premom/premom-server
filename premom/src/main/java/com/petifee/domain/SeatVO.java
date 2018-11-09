package com.petifee.domain;

import java.util.Date;

public class SeatVO {
	private int idx;
	private int is_seat;
	private int fast_transfer;
	private String car;
	private String sub_car;
	
	
	
	public SeatVO(){
	}

	
	public SeatVO(int idx, int is_seat,  int fast_transfer){
		this.idx = idx;
		this.is_seat = is_seat;
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


	public int getFast_transfer() {
		return fast_transfer;
	}

	public void setFast_transfer(int fast_transfer) {
		this.fast_transfer = fast_transfer;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getSub_car() {
		return sub_car;
	}

	public void setSub_car(String sub_car) {
		this.sub_car = sub_car;
	}
	

}
