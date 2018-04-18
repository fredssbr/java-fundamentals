package com.pluralsight.calcengine;

public class Main {

	public static void main(String[] args) {
		// useMathEquation();
		// useCalculatorBase();
		String[] statements = {
				"divide 100.0 50.0",
				"add 25.0 92.0",
				"subtract 225.0 17.0",
				"multiply 11.0 3.0"
		};
		
		CalculateHelper helper = new CalculateHelper();
		for(String statement: statements) {
			helper.process(statement);
			System.out.println(helper);
		}
	}
	
	static void useMathEquation() {
		/*
		 * double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d}; double[] rightVals =
		 * {50.0d, 92.0d, 17.0d, 3.0d}; char[] opCodes = {'d', 'a', 's', 'm'}; double[]
		 * results = new double[opCodes.length];
		 */

		MathEquation[] equations = new MathEquation[4];

		equations[0] = new MathEquation('d', 100.0d, 50.0d);
		equations[1] = new MathEquation('a', 25.0d, 92.0d);
		equations[2] = new MathEquation('s', 225.0d, 17.0d);
		equations[3] = new MathEquation('m', 11.0d, 3.0d);

		for (MathEquation equation : equations) {
			equation.execute();
			System.out.print("result = ");
			System.out.println(equation.getResult());
		}
		
		System.out.println();
		System.out.println("Using overloads");
		System.out.println();
		
		double leftDouble = 9.0d;
		double rightDouble = 4.0d;
		
		int leftInt= 9;
		int rightInt = 4;
		
		MathEquation equationOverload = new MathEquation('d');
		
		equationOverload.execute(leftDouble, rightDouble);
		System.out.print("result=");
		System.out.println(equationOverload.getResult());
		
		equationOverload.execute(leftInt, rightInt);
		System.out.print("result=");
		System.out.println(equationOverload.getResult());
		
		equationOverload.execute((double)leftInt, rightInt);
		System.out.print("result=");
		System.out.println(equationOverload.getResult());
		
		System.out.println();
		System.out.println("Using inheritance");
		System.out.println();
		
	}
	
	static void useCalculatorBase() {
		CalculateBase[] calculators = {
				new Divider(100.0d, 50.0d),
				new Adder(25.0d, 92.0d),
				new Subtracter(225.0d, 17.0d),
				new Multiplier(11.0d, 3.0d)
		};
		
		for (CalculateBase calculator : calculators) {
			calculator.calculate();
			System.out.print("result=");
			System.out.println(calculator.getResult());
		}
	}

}
