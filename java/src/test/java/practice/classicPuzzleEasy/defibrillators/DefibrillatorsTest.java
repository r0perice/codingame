/*
 * Author: Robin Péricé (2018)
 */
package practice.classicPuzzleEasy.defibrillators;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.TestException;

import common.AbstractTest;
import practice.classic.puzzle.medium.thereIsTheSpoonEp1.ThereIsTheSpoonEp1Solution;

public class DefibrillatorsTest extends AbstractTest {

	public static void main(final String[] args) {
		try {
			final DefibrillatorsTest test = new DefibrillatorsTest();
			final List<String> testFiles = Arrays.asList("file01", "file02", "file03", "file04");
			final String resourcesFolder = "practice/classic/puzzle/easy/defibrillators/";
			final List<String> solutions = Arrays.asList("Maison de la Prevention Sante", "Cimetiere Saint-Etienne",
					"Caisse Primaire d'Assurance Maladie", "Amphitheatre d'O");

			final int i = 0;
			for (final String testFile : testFiles) {
				try (Scanner sc = test.loadTestFile(resourcesFolder + testFile);) {
					final ThereIsTheSpoonEp1Solution solution = new ThereIsTheSpoonEp1Solution();
					final String solve = solution.solve(sc);
					System.out.println(solve);
					Assert.assertTrue(solutions.get(i).equals(solve));
				}
			}
		} catch (final Exception e) {
			throw new TestException(e);
		}
	}

}
