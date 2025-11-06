package remotecontrol;

public class Audio implements RemoteControl {
	int volume;
	
	public void TrunOn() {
		System.out.println("Turn on TV!!");
	}
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("Audio volume : " + volume);

}
