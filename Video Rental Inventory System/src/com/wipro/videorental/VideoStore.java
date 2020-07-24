package com.wipro.videorental;

public class VideoStore extends Video {

	String videos[]=new String[10];
	int i=0;
	int h=0;
	int[] rate=new int[10];
	
	void addVideo(String title)
	{
		videos[i++]=title;
		
	}
	void checkout(String title)
	{
		int index = 0;
		for(int j=0;j<3;j++)
		{
			
			if(videos[j].equalsIgnoreCase(title))
			{
			  index=j;
			}
		}
       beingCheckedout(index);
	}
	void returnvideo(String title)
	{
		int index = 0;
		for(int j=0;j<3;j++)
		{
			
			if(videos[j].equalsIgnoreCase(title))
			{
			  index=j;
			}
		}
	   beingReturned(index);
	}
	void receiveRating(int index,int rating)
	{
		rate[index]=rating;
		receiveARating(index, rating);
	}
	void listInventory()
	{
		int j=0;
		
		for(j=0;j<3;j++)
		{
			System.out.println(videos[j]+" "+flag[j]);
		}
		
	}
}
