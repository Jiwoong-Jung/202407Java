package running;

public class RunningStrategy extends MovingStrategy {

	@Override
	public String[] getImages() {
		return ImageService.runningImageNames;
	}

}
