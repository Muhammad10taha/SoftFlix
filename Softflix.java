import java.util.*;
public class Softflix{
	private boolean membership=false;
private final int SERIES=10,SEASONS=3,EPISODES=15;
private int searched_index=0;
public ArrayList<String> series=new ArrayList<String>();//the list of series
private PriorityQueue seasons=new PriorityQueue();// Shows seasons
private PriorityQueue episodes=new PriorityQueue();//the list of episodes in order
Softflix(){
series.add("Money Heist");
series.add("Sacred Games");
series.add("Mirzapur");
series.add("The Flash");
series.add("Game of Thrones");
series.add("Stranger Things");
series.add("13 Reasons Why");
series.add("Naruto:Shippudden");
series.add("Black Clover");
series.add("Dragon Ball Super");
seasons.add(1);
seasons.add(2);
seasons.add(3);
episodes.add(1);
episodes.add(2);
episodes.add(3);
episodes.add(4);
episodes.add(5);
episodes.add(6);
episodes.add(7);
episodes.add(8);
episodes.add(9);episodes.add(10);episodes.add(11);
episodes.add(12);episodes.add(13);episodes.add(14);episodes.add(15);}
public int searchSeries(Object x){
	for(int i=0;i<series.size;i++)
	{
		if(series.get(i)==x){
			searched_index=i;
			return i;
		}
}
return -1;
}
public int searchSeason(int x){
	for(int i=0;i<Seasons.size();i++)
	{
		if(seasons.peek()==x){
			searched_index=i;
			return i;
		}
}
return -1;
}
public int searchEpisode(int x,String s){
	for(int i=0;i<series.size();i++){
		if(series.get(i)==s){
	for(int i=0;i<episodes.size;i++)
	{
		if(episodes.peek()==x){
			searched_index=i;
			return i;
		}
		}
		}
	}
return -1;
}
public void becomeamember(boolean a){
	Scanner sc=new Scanner(System.in);
	if(a==true){
	}
	if(a==false){
		System.out.println("do you want to become a member?");
		String s=sc.nextLine();
		if(s=="yes"){
			System.out.println("Credit card number=");
			double x=sc.nextDouble();
			System.out.println("jao aish karo");
		}
		if(s=="no"){
			System.out.println("nikal\n----------------");
			Thread.sleep(10000);
			System.exit(0);}
	}
}
public String reccommend(){
	System.out.print(series.get(searched_index));
	Thread.sleep(600000);
}
public String getSeries(int i){
	return series.get(i);
} 
public String getSeason(int i){
	return seasons.get(i);
} 
public String getEpisode(int i){
	return episodes.get(i);
} 
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	Softflix s=new Softflix();
	s.becomeamember(false);
	System.out.println("What do you wanna watch?");
	String h=sc.nextLine();
	int x=s.searchSeries(h);
	System.out.println(s.getSeries(x));
	s.reccommend();
	
	
	
	
}

 
}