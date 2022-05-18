package jp.co.aforce.text2;

class Radio implements Powerable{

	//電源の状態
	private boolean isPowered = false;

	//電源ON
	@Override
	public boolean powerOn() {

		if (!isBatteryEnabled()) {

			return false;

		}

		this.isPowered = true;
		return true;
	}

	//電源OFF
	@Override
	public void powerOff() {
		this.isPowered = false;

	}

	//バッテリーがあるか
	private boolean isBatteryEnabled() {

		return true;

	}

}
