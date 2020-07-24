package com.wipro.videorental;

public class Video {

   String title;
   boolean[]  flag=new boolean[10];
   int[] user_rating=new int[10];
   void beingCheckedout(int index)
	{
	   if(flag[index]==true) {
			flag[index]=false; }
	}
	void beingReturned(int index)
	{
     if(flag[index]==false) {
			  flag[index]=true; }
	}
	void receiveARating(int index,int rate)
	{
		user_rating[index]=rate;
	}
}
