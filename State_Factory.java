package devforrest.mario.objects.mario;

public class State_Factory {
	int Min, MaxA, MaxB;
	public State_Factory() {
		this.Min = 1;
		this.MaxA = 4;
		this.MaxB = 3;
	}
	
	public Mario_State Wheel_Of_States(Mario m) {
	
		Mario_State state = getBaseState();
		state = getDecoratorState(m, state);
		return state;

	}
	
	public Mario_State getBaseState() {
		//Set the base state
		int stateChoose = Min + (int)(Math.random() * ((MaxA - Min) + 1));
		Mario_State state = new Regular_State();
		System.out.println(stateChoose);
		switch(stateChoose) {
		case 1:
			state = new Regular_State();	
			break;
		case 2:
			state = new Reverse_State();
			break;
		case 3: 
			state = new Confusion_State();
			break;
		case 4:
			state = new Confusion_StateB();
			break;
		}
		return state;
	}
	
	public Mario_State getDecoratorState(Mario m , Mario_State state) {
		//Add the decorator for each state
		int Trials = 3;
		while (Trials > 0) {
		int stateChooseA = Min + (int)(Math.random() * ((MaxB - Min) + 1));
		
		switch(stateChooseA) {
		case 1:
			break;
		case 2:
			state = new MidgetJump_State(state, m);
			break;
		case 3:
			state = new GiantJump_State(state, m);
			break;
		case 4:
			state = new Healthy_State(state, m);
			break;
		case 5:
			state = new Sickly_State(state, m);
			break;
		case 6:
			state = new Fat_State(state, m);
			break;
		case 7:
			state = new Feather_State(state, m);
			break;
		}
		Trials--;
		}
		return state;
	}
}
