package devforrest.mario.objects.mario;

public class Confusion_StateB implements Mario_State {

	public void setSpace(Mario m, boolean set){
		m.setSpace(set);
	}
	public void setLeft(Mario m, boolean set){
		m.setRight(set);
	}
	public void setRight(Mario m, boolean set){
		m.setDown(set);
	}
	public void setDown(Mario m, boolean set){
		m.setLeft(set);
	}
}
