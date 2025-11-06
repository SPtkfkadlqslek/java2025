package remotecontrol;

public class Radion implements RemoteControl{
	int volume;
	
	public void TrunOn() {
		System.out.println("Turn on TV!!");
	}
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("Radio volume : " + volume);
}
