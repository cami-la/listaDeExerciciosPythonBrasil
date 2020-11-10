class Tv {
	//atrinutes
	private int channelNumber;
	private int soundVolume;
	private boolean connect;
	
	
	//special methods
	public Tv() {
		this.channelNumber = 13;
		this.soundVolume = 20;
		this.connect = true;
	}
	
	private void setChannelNumber(int newChannelNumber) {
		this.channelNumber = newChannelNumber;
	}
	
	private int getChannelNumber() {
		return this.channelNumber;
	}
	
	private int getSoundVolume() {
		return this.soundVolume;
	}
	
	private void setSoundVolume(int volume) {
		this.soundVolume = volume;
	}
	
	private void setConnect(boolean connect) {
		this.connect = connect;
	}
	
	private boolean getConnect() {
		return this.connect;
	}
	
	@Override
	public String toString() {
		return "TV: [Channel Number: " + this.getChannelNumber() + ", Sound Volume: " + this.getSoundVolume() + "]";
	}
	
	
	//methods
	public void volumeUp() {
		if (this.getConnect() && this.getSoundVolume() < 100) {
			this.setSoundVolume(this.getSoundVolume() + 5);
		} else if (this.getSoundVolume() == 100) {
			System.out.println("It was not possible volume up!");
		}
	}
	
	public void volumeDown() {
		if (this.getConnect() && this.getSoundVolume() > 0) {
			this.setSoundVolume(this.getSoundVolume() - 5);
		} else if (this.getSoundVolume() == 0) {
			System.out.println("It was not possible volume down!");
		}
	}
	
	public void changeChannel(int newChannelNumber) {
		if (this.getConnect() && newChannelNumber > 0 && newChannelNumber <= 100) {
			this.setChannelNumber(newChannelNumber);				
			}
		}
		
	public void turnOff() {
		this.setConnect(false);
	}
	
	public void turnOn() {
		this.setConnect(true);
	}
	
}

