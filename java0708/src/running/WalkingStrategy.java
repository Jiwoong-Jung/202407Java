package running;

public class WalkingStrategy extends MovingStrategy {

	@Override
	public String[] getImages() {
		return ImageService.walkingImageNames;
	}

}
