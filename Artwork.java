public class Artwork{

private String title;
private int year;
Artist artist;


//constructor1
Artwork(String title, int year, Artist artist){
this.title = title;
this.year = year;
this.artist = artist;
}


//constructor2
Artwork(String title, int year){
this.title = title;
this.year = year;
}

//methods
public String getTitle(){
return title;
}

public int getYear(){
return year;
}


public Artist getArtist(){
return artist;
}

//Display information

public void displayInfo(){
System.out.println("The Title of the network: " + title);
System.out.println("The year the artwork was created: " + year);
artist.displayInfo();

}

/*
	Artwork(){
	   this.artist = artist.getArtist(); //shallow copy
		

	}

	Artwork(){
		
		this.artist = new Artist(artist.getArtist()); //deep copy

	}

*/
}

//Samra Alam
//sp24-bse-137