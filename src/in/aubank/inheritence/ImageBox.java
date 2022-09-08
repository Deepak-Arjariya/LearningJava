package in.aubank.inheritence;

public class ImageBox extends UIControl {
	
	String imageUrl = "";
	int width;
	int height;
	
	ImageBox(){
		super(true);
		
		height = 1;
		width = 2;
		imageUrl = "cat picture";
	}
	
	@Override
	public void render() {
		System.out.println("Printing image of width: " + width + " and height: " + height + ". The image is a " + imageUrl);
	}
	
	
}
