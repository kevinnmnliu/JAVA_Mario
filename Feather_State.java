package devforrest.mario.objects.mario;

public class Feather_State implements Mario_State {

	protected Mario_State wrappee;
	protected Mario m;
	
	public Feather_State(Mario_State wrappee, Mario m) {
		this.wrappee = wrappee;
		m.setFall(-0.05f);
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
