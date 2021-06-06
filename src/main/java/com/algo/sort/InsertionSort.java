package com.algo.sort;

public class InsertionSort {

  static void sort(int[] numbers) {

    /* {5, 4, 1, 2, 4, 0} */
    for (var curr = 1; curr < numbers.length; curr++) {
      int prev = curr - 1;
      int tempPosition = curr;
      while (prev >= 0 && numbers[tempPosition] < numbers[prev]) {
        swap(numbers, tempPosition, prev);
        tempPosition --;
        prev--;
      }

    }

  }

  private static void swap(int[] numbers, int curr, int prev) {
    var temp = numbers[curr];
    numbers[curr] = numbers[prev];
    numbers[prev] = temp;
  }
}
