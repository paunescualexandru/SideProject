/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wikisort;

/**
 *
 * @author Dinamo
 */
class TestingMostlyEqual extends Testing {
	int value(int index, int total) {
		return 1000 + SortRandom.nextInt(4);
	}
}
