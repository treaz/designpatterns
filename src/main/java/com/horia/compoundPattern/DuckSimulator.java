package com.horia.compoundPattern;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator sim = new DuckSimulator();
//		sim.simulate();
		CountingDuckFactory cdf = new CountingDuckFactory();
		sim.simulate(cdf);
	}

	/**
	 * first phase
	 */
//	private void simulate() {
//		Quackable mallard = new MallardDuck();
//		Quackable redHead = new RedHeadDuck();
//		Quackable rubberD = new RubberDuck();
//		Quackable duckCall = new DuckCall();
//		Quackable goose = new GooseAdapter(new Goose());
//		
//		simutate(mallard);
//		simutate(redHead);
//		simutate(rubberD);
//		simutate(duckCall);
//		simutate(goose);
//		
//		System.out.println(QuackCounter.getQuacks());
//		
//	}
	
	/**
	 * second phase
	 * @author Horia Constantin
	 * @param quackable
	 */
	private void simulate() {
		Quackable mallard = new QuackCounter(new MallardDuck());
		Quackable redHead = new QuackCounter(new RedHeadDuck());
		Quackable rubberD = new QuackCounter(new RubberDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable goose = new GooseAdapter(new Goose());
		
		simutate(mallard);
		simutate(redHead);
		simutate(rubberD);
		simutate(duckCall);
		simutate(goose);
		
		System.out.println(QuackCounter.getQuacks());
		
	}
	
//	/**
//	 * third phase
//	 * @author Horia Constantin
//	 */
//	private void simulate(CountingDuckFactory cdf) {
//		
//		Quackable mallard = cdf.createMallardDuck();
//		Quackable redHead = cdf.createRedHeadDuck();
//		Quackable rubberD = cdf.createRubberDuck();
//		Quackable duckCall = cdf.createDuckCall();
//		Quackable goose = new GooseAdapter(new Goose());
//		
//		simutate(mallard);
//		simutate(redHead);
//		simutate(rubberD);
//		simutate(duckCall);
//		simutate(goose);
//		
//		System.out.println(QuackCounter.getQuacks());
//		
//	}
	
//	/**
//	 * fourth phase
//	 * @author Horia Constantin
//	 */
//	private void simulate(CountingDuckFactory cdf) {
//		
//		Quackable redHead = cdf.createRedHeadDuck();
//		Quackable rubberD = cdf.createRubberDuck();
//		Quackable duckCall = cdf.createDuckCall();
//		Quackable goose = new GooseAdapter(new Goose());
//		
//		Flock flockOfDucks = new Flock();
//		flockOfDucks.add(goose);
//		flockOfDucks.add(redHead);
//		flockOfDucks.add(rubberD);
//		flockOfDucks.add(duckCall);
//		
//		Flock flockOfMallards = new Flock();
//		flockOfMallards.add(cdf.createMallardDuck());
//		flockOfMallards.add(cdf.createMallardDuck());
//		flockOfMallards.add(cdf.createMallardDuck());
//		flockOfMallards.add(cdf.createMallardDuck());
//		
//		flockOfDucks.add(flockOfMallards);
//		
//		System.out.println("whole flock");
//		simutate(flockOfDucks);
//		
//		System.out.println("flock of mallards");
//		simutate(flockOfMallards);
//		
//		System.out.println(QuackCounter.getQuacks());
//		
//	}

	/**
	 * fifth phase
	 * @author Horia Constantin
	 */
	private void simulate(CountingDuckFactory cdf) {
		
		Quackable redHead = cdf.createRedHeadDuck();
		Quackable rubberD = cdf.createRubberDuck();
		Quackable duckCall = cdf.createDuckCall();
		Quackable goose = new GooseAdapter(new Goose());
		
		Flock flockOfDucks = new Flock();
		
		flockOfDucks.add(redHead);
		flockOfDucks.add(rubberD);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(goose);
		
		Flock flockOfMallards = new Flock();
		flockOfMallards.add(cdf.createMallardDuck());
		flockOfMallards.add(cdf.createMallardDuck());
		flockOfMallards.add(cdf.createMallardDuck());
		flockOfMallards.add(cdf.createMallardDuck());
		
		flockOfDucks.add(flockOfMallards);
		
		Quackologist q = new Quackologist();
		flockOfDucks.registerObservers(q);
		
//		System.out.println("whole flock");
		simutate(flockOfDucks);
//		
//		System.out.println("flock of mallards");
//		simutate(flockOfMallards);
		
		System.out.println(QuackCounter.getQuacks());
		
	}

	
	private void simutate(Quackable quackable) {
		quackable.quack();
		
	}
}
