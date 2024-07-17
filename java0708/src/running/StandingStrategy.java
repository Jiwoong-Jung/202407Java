package running;

public class StandingStrategy extends MovingStrategy {

	@Override
	public String[] getImages() {
		return ImageService.standingImageNames;
	}

}
