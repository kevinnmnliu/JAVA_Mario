package devforrest.mario.objects.mario;

public class Healthy_State implements Mario_State {

	protected Mario_State wrappee;
	protected Mario m;
	
	public Healthy_State(Mario_State wrappee, Mario m) {
		this.wrappee = wrappee;
		m.setHealth(3);
	}
	public void setSpace(Mario m, boolean set){
		wrappee.setSpace(m, set);
	}
	public void setLeft(Mario m, boolean set){
		wrappee.setLeft(m, set);
	}
	public void setRight(Mario m, boolean set){
		wrappee.setRight(m, set);
	}
	public void setDown(Mario m, boolean set){
		wrappee.setDown(m, set);
	}


}
