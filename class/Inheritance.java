// base//parent/super class
// derived/child/sub class

// inherit
// re-define
// embellish

class Horse {
	public int age; protected String owner;
	protected double value;
}

class RaceHorse extends Horse {
	private int value; // can re-define type (double to int
	// * 이렇게 타입을 바꾸면 당연히 accessor/getter 함수 타입도 overload/override 해줘야 함
	int numberOfWins;
	int getNumWins(){} void winRace(){}

	@Override // override 명시 가능
	public void beSold(String owner) { numberOfWins = 0; }

	RaceHorse() { super(50, 0) } // 부모 클래스의 생성자는 super로도 사용가능
}

{
	Horse h;
	RaceHorse r = new RaceHorse();

	h = r;
}

{
	Horse h = new Horse();
	RaceHorse r;

	r = h; // compile-time error

	r = (RaceHorse) h; // run-time error (ClsssCaseException)
}

{
	Horse h1 = new Horse(); // O
	Horse h2 = new Horse(); // O
	RaceHorse r;

	r = h1; // X
	r = h2; // X
	r = (RaceHorse) h1; // X
	r = (RaceHorse) h2; // O
}

{
	public static void f1(Horse h) {}
	public static void f2(RaceHorse r) {}
	public static RaceHorse g() {}

	public static void main(String[] args){
		Horse h = new RaceHorse();
		RaceHorse r = new RaceHorse();
		f1(r);
		h = g();
		Horse h1 = new RaceHorse();
		Horse h2 = new Horse();
		f2(h1); // X
		f2( (RaceHorse) h1 );
		f2( (RaceHorse) h2 ); // X
		h.winRace(); // X
		( (RaceHorse)h ).winRace();
		(RaceHorse)h.winRace(); // X
	}
}

// upcasting : sub -> super
// downcasting : super -> sub

// 모든 클래스는 ' Object ' 클래스를 상속받음
// Object 클래스에는 toString method가 선언되어 있고, println같은 string을 활용할 때 이 method를 활용
