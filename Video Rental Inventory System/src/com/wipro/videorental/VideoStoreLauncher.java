package com.wipro.videorental;

import java.util.Arrays;

public class VideoStoreLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VideoStore v1=new VideoStore();
		Arrays.fill(v1.flag,true);
	    v1.addVideo("The Matrix");
		v1.addVideo("Godfather II");
		v1.addVideo("Star War Episode IV: A New Hope");
		v1.receiveRating(0, 4);
		v1.receiveRating(1, 3);
		v1.receiveRating(2, 5);
	    v1.checkout("The Matrix");
	    v1.checkout("Godfather II");
		v1.checkout("Star War Episode IV: A New Hope");
		v1.returnvideo("The Matrix");
		v1.returnvideo("Godfather II");
		v1.returnvideo("Star War Episode IV: A New Hope");
		v1.checkout("Godfather II");
		v1.listInventory();
			
	}

}
