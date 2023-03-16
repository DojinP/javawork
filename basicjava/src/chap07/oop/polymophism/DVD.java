package chap07.oop.polymophism;

public class DVD extends Content {
	private String genre;

	public DVD(String title, String genre) {
		super(title);
		this.genre = genre;
	}

	@Override
	public void totalPrice() {
		if(genre.equals("new")) {
			setPrice(12000);
		}else if(genre.equals("comic")) {
			setPrice(11500);
		}else if(genre.equals("child")) {
			setPrice(11000);
		}else {
			setPrice(500);
		}
	}
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
