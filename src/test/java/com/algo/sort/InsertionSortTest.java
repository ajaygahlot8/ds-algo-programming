package com.algo.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class InsertionSortTest {

  @Test
  void testInsertionSort() {
    int[] numbers = {5, 4, 1, 2, 4, 0};

    InsertionSort.sort(numbers);
    assertEquals("[0, 1, 2, 4, 4, 5]", Arrays.toString(numbers));
  }
}
