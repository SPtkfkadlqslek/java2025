package remotecontrol;

public class Television implements RemoteControl {
	int volume;
	
	public void TrunOn() {
		System.out.println("Turn on TV!!");
	}
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("Audio volume : " + volume);
	}
}
