package practice.practice1.hanoi.jorsef;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.Tower;

public class NotImplementedSolverImplTest {

	@Test
	public void testSolve() {
		Tower a =  new Tower("A", 2);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new NotImplementedSolverImpl();
	
		List<String> result = solver.solve(a, b, c, 2, new ArrayList<String>());
		assertEquals(1, result.size());
		//assertEquals("%s", result.get(0));
	}

}
