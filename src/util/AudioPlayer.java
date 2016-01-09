package util;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class AudioPlayer {
	private AudioClip putCoinClip;
	private AudioClip getCoinClip;
	private AudioClip waterFlowClip;
	
	public AudioPlayer(){
		URL url = this.getClass().getResource("/resource/putCoin.wav");
		putCoinClip = Applet.newAudioClip(url);
		
		url = this.getClass().getResource("/resource/getCoin.wav");
		getCoinClip = Applet.newAudioClip(url);
		
		url = this.getClass().getResource("/resource/waterFlow.wav");
		waterFlowClip = Applet.newAudioClip(url);
	}	
	public void playPutCoin(){
		putCoinClip.play();
	}
	public void playGetCoin(){
		getCoinClip.play();
	}
	public void playWaterFlow(){
		waterFlowClip.play();
	}
	
	
}
