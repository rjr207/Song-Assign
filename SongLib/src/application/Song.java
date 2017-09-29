package application;

public class Song {
	
	public String title;
	public String artist;
	public String album;
	public String year;
	
	public Song(String title, String artist, String album, String year){
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
		
	}
	
	//method returns false if not equal (or not a song object)
	//returns true if title and artist match (year and album are irrelevant)
	public boolean equals(Object o){
		if((o == null) || !(o instanceof Song)){
			return false;
		}
		Song other = (Song) o;
		if(other.title == this.title && other.artist == this.artist){
			return true;
		}
		return false;
		
	}
	
	public String toString(){
		return (title + ", " + artist + ", " + album + ", " + year);
	}

}
